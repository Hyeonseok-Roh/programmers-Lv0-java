package solutions;

public class MumblingFirst {

  public int solution(String[] babblings) {
    int answer = 0;
    for (String babbling : babblings) {
      answer += findCollection(babbling);
    }
    return answer;
  }

  public int findCollection(String babbling) {
    String ret = babbling.replaceAll("aya|ye|woo|ma", "-");
    String ret2 = ret.replaceAll("-", "");
    if (ret2.length() == 0) {
      return 1;
    } else {
      return 0;
    }
  }
}

