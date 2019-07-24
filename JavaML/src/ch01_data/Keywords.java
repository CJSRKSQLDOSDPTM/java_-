/*
 * 1. 자바기반 머신러닝 학습을 위한 환경 구축
 * 2. weka를 설치하고 classifier4j 라이브러리를 이용하여 키워드 유사도를 측정한다.
 */
package ch01_data;
import java.util.ArrayList;
import java.util.List;
import net.sf.classifier4J.ClassifierException;
import net.sf.classifier4J.vector.HashMapTermVectorStorage;
import net.sf.classifier4J.vector.TermVectorStorage;
import net.sf.classifier4J.vector.VectorClassifier;
public class Keywords {
	public Keywords() {
		// 올바른 검색어
		String correct = "Java Program";
		
		List<String> terms = new ArrayList<>();
		terms.add("Java Program");
		terms.add("Java Programmer");
		terms.add("Java Prograamm");
		terms.add("Java Prograaamm");
		terms.add("Javva Program");
		terms.add("Jaba Program");
		terms.add("R Progrem");
		TermVectorStorage storage = new HashMapTermVectorStorage();
		VectorClassifier vc = new VectorClassifier(storage);
		for(String term : terms) {
			try {
				vc.teachMatch("sterm", correct);
				// 검색어의 유사도 측정
				// Classfier4J 라이브러리를 이용하여 검색어에 대해 벡터 공간 검색을 수행하여 정확한 스펠링 순위를 매김
				double result = vc.classify("sterm", term);
				System.out.println(term + "=" + result);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}// end of for
		
	}// end of Keywords()

	public static void main(String[] args) {
		new Keywords();
	}// end of main
}// end of class Keywords
