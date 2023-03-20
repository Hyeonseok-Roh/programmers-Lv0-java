package solutions;

import java.util.*;

class RotationArray {
  public int[] solution(int[] numbers, String direction) {

    ArrayDeque<Integer> queue = new ArrayDeque<>();

    for(int num : numbers)
    {
      queue.addLast(num);
    }

    if(direction.equals("left"))
    {
      int first = (int)queue.pollFirst();
      queue.addLast(first);
      int[] answer = new int[queue.size()];
      for (int i=0; i<answer.length; i++) {
        answer[i] = (int)queue.pollFirst();
      }
      return answer;
    }
    else
    {
      int second = (int)queue.pollLast();
      queue.addFirst(second);
      int[] answer = new int[queue.size()];
      for (int i=0; i<answer.length; i++) {
        answer[i] = (int)queue.pollFirst();
      }
      return answer;
    }



  }
}