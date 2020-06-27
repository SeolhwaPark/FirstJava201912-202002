import java.util.ArrayList;
import java.util.List;

/*
 * 리스트 words에는 여러개의 영어단어가 입력되어있다.
 * 입력된 단어들 중에 가장길이가 긴 단어를 출력하는 프로그램을 작성
 * 가장 긴 단어가 여러개인 경우에는 모두 출력
 * 
 * word = ['hello','tall','school', 'hi', 'hey']
 * output : school
 */
public class Exam_02 {
	public static void main(String[] args) {
		List<String> word= new ArrayList<String>();
		word.add("hello"); 
		word.add("tall"); 
		word.add("school"); 
		word.add("aaaaaa");
		word.add("hi"); 
		word.add("hey"); 
		
		System.out.println("word ="+ word.get(0));
		int max =0;
		int cnt=0;
		String maxData[]= new String[word.size()];
		for(int x=0; x<word.size();x++) {
			
			if(word.get(x).length()>max) {
				max = word.get(x).length();
				maxData[0] = word.get(x);
			}else if(max == word.get(x).length()){
				cnt++;
				maxData[cnt]= word.get(x);
			}
		}
		System.out.println(max);
		for(int x=0; x<=cnt; x++) {
			System.out.println(maxData[x]);
		}
	}

}
