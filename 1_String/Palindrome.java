import java.util.*;

public class Palindrome {
  /* 
  회문 문자열
  
  1. 설명
    앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
  
  2. 입력 
    문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 
    회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    단 회문을 검사할 때 대소문자를 구분하지 않습니다.

  3. 입력
    첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
  */
/* 
    public String solution(String str) {
      String answer = "YES";
      str = str.toLowerCase();
      int len =str.length();
      for(int i=0; i < len/2; i++) {
        if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
      }
      return answer;
    }
*/
public String solution(String str) {
    String answer = "YES";
    String tmp = new StringBuilder(str).reverse().toString();
    if(!tmp.equals(str)) answer = "NO";
    return answer;  
}
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      Palindrome palindrome = new Palindrome();
      System.out.print(palindrome.solution(str));
    }  
}
