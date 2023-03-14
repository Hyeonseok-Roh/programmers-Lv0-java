package solutions;

class TriangleCondition {

  public int solution(int[] sides) {
    int answer = 0;

    int maxIndex = 0;
    int max = 0;
    for (int i = 0; i < sides.length; i++) {
      if (sides[i] > max) {
        max = sides[i];
        maxIndex = i;
      }
    }

    if (maxIndex == 0) {
      if (sides[1] + sides[2] > sides[0]) {
        answer = 1;
      } else {
        answer = 2;
      }
    } else if (maxIndex == 1) {
      if (sides[0] + sides[2] > sides[1]) {
        answer = 1;
      } else {
        answer = 2;
      }
    } else {
      if (sides[0] + sides[1] > sides[2]) {
        answer = 1;
      } else {
        answer = 2;
      }
    }

    return answer;
  }
}
