import java.util.*;

public class ReverseWord2 {
  /* 
  특정 문자 뒤집기
    1.설명
    영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
    특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

    2.입력
    첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

    3. 출력
    첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
  */
  
  public String solution(String str) {
    String answer = "";
    char[] arr = str.toCharArray();
    int lt = 0;
    int rt = str.length() - 1;
      while(lt < rt ) {
        if(!Character.isAlphabetic(arr[lt])) lt++;
        else if(!Character.isAlphabetic(arr[rt])) rt--;
        else {
          char tmp = arr[lt];
          arr[lt] = arr[rt];
          arr[rt] = tmp;
          lt++;
          rt--;
        }
      }
    answer = String.valueOf(arr);
    return answer;
  }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      ReverseWord2 reverseWord2 = new ReverseWord2();
      String str = sc.next();
      System.out.print(reverseWord2.solution(str));
    }
}
