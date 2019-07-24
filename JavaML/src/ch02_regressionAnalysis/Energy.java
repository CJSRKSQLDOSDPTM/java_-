package ch02_regressionAnalysis;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.swing.JFrame;

import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.classifiers.trees.M5P;
import weka.core.Instances;
import weka.core.converters.CSVLoader;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

public class Energy {

	public static void main(String[] args) throws Exception {
		// 데이터 로딩
		CSVLoader loader = new CSVLoader();
		loader.setFieldSeparator(",");
		loader.setSource(new File("D:/data/ENB2012_data.csv"));
		Instances data = loader.getDataSet();
		
		// 데이터 출력
		//System.out.println(data);
		// 회귀분석 모델 개발 및 평가
		// 난방 하중의 러닝 모델 개발
		data.setClassIndex(data.numAttributes()-2);
		// 두번째 타겟 변수인 Y2(냉방하중) 삭제
		Remove remove = new Remove();
		remove.setOptions(new String[] { "-R", data.numAttributes() + ""});
		remove.setInputFormat(data);
		data = Filter.useFilter(data, remove);
		// 선형 회귀분석 모델 생성
		LinearRegression model = new LinearRegression();
		model.buildClassifier(data);
		//회귀모델 출력
		System.out.println("선형회귀모델:\n" + model);
		// -64.774 * x1 : x1변수(건물의 상대적 크기) 난방하중과 음의 상관관계
		// 19.9327 * x7 : x7변수(유리창 면적) 난방하중과 양의 상관관계
		// 10회 교차 평가 모델 실행
		Evaluation eval = new Evaluation(data);
		eval.crossValidateModel(model, data, 10, new Random(1), new String[] {});
		System.out.println(eval.toSummaryString());
		double coef[] = model.coefficients();
		System.out.println();
		// 상관계수 Correlation coefficient 0.956
		// 오차 절대값 평균 Mean absolute error 2.0923
		// 평균 제곱근 오차 Root mean squared error 2.9569
		// 상대 절대값 오차 Relative absolute error 22.8555%
		// 상대 제곱근 오차 Root relative squared error 29.282%
		// 총 인스턴스의 수 Total Number of Instances 768
		// M5P 클래스를 이용하여 회귀분석 트리 생성
		M5P md5 = new M5P();
		md5.setOptions(new String[] { "" });
		md5.buildClassifier(data);
		System.out.println(md5);
		//회귀분석 트리로 10회 교차 평가 모델 실행
		eval.crossValidateModel(md5, data, 10, new Random(1), new String[] {});
		System.out.println(eval.toSummaryString());
		System.out.println();
		// 시각화
		TreeVisualizer tv = new TreeVisualizer(null, md5.graph(), new PlaceNode2());
		JFrame frame = new JFrame("회귀분석 트리 시각화");
		frame.setSize(1200,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(tv);
		frame.setVisible(true);
		tv.fitToScreen();
	}
}
