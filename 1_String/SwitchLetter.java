import java.util.*;

/*
  대소문자 변환
    1. 설명
      대문자와 소문자가 같이 존재하는 문자열을 입력받아 
      대문자는 소문자로 소문자는 대문자로 변환하여 
      출력하는 프로그램을 작성하세요.
    2. 입력
      첫 줄에 문자열이 입력된다. 
      문자열의 길이는 100을 넘지 않습니다.
      문자열은 영어 알파벳으로만 구성되어 있습니다.
      
    3. 출력
      첫 줄에 대문자는 소문자로, 
      소문자는 대문자로 변환된 문자열을 출력합니다.
 */

public class SwitchLetter {
  
  public String solution(String str) {
    String answer = "";
    for(char x : str.toCharArray()) {
    //   if(Character.isLowerCase(x)) {
    //     answer += Character.toUpperCase(x);
    //   } else {
    //     answer += Character.toLowerCase(x);
    //   }
    //askii number 대문자: 65~90 , 소문자: 97~122 
    //소문자 a - 대문자 A = 32
        if(x>=97 && x<=122) answer+=(char)(x-32);
        else answer+=(char)(x+32);
    }
    return answer;
  }
  
  public static void main(String[] args) {
    SwitchLetter switchLetter = new SwitchLetter();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(switchLetter.solution(str));
  }
  
}
