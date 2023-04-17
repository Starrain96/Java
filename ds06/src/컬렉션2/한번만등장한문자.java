package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		String s = "abcabcadc";
		//문자열을 하나씩 구분을 할 예정 toCharArray / split / toCharAt
		// 1-toCharArray()
		// 2-split("")
		// 3-ChatAt(index)

		//어떤 문자들이 들어있는지 목록을 만들자.
		//	중복을 없애면 목록을 구할 수 있을 것 같다.
		//	중복 없애기 -> HashSet 사용
		HashSet<String> set = new HashSet<>();
		String[] s2 = s.split("");
		System.out.println(Arrays.toString(s2)); //[a, b, c, a, b, c, a, d, c]
		for (String x : s2) {
			set.add(x);
		}
		System.out.println(set.size()); //4
		System.out.println(set); // [a, b, c, d]
		
		//배열안에 set에 들어있는 요소가 1인 것만 찾으면 된다.
		Object[] set2 = set.toArray();
		List<String> list = Arrays.asList(s2);
		
		String answer = "";
		
		for (Object x : set2) {
			if ( Collections.frequency(list, x)==1 ) {
				answer +=x;
			}
		}
		
		System.out.println(answer);
	}

}
