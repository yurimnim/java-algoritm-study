import java.util.*;

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
