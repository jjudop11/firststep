package ct;

public class Ct20220331_3 {
	
	/* 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
	 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	 */
	
	public String solution(String s) {
        
		String result = "";
		 
		 for(int i = 0; i < s.length(); i++) {
			 if(s.length() %2 == 0) {
				 result = s.substring(s.length()/2-1, s.length()/2+1);
			 } else {
				 result = s.charAt(s.length()/2)+"";
				
			 }
		 }
        return result;
    }
	
}
