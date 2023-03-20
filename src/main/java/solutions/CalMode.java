package solutions;

import java.util.*;
import java.util.Map.Entry;

public class CalMode {

  public int solution(int[] array) {

    HashMap<Integer, Integer> arrayMap = new HashMap<>();

    if (array.length == 1) {
      return array[0];
    }

    for (int num : array) {

      if (arrayMap.get(num) == null) {
        arrayMap.put(num, 1);
      } else {
        arrayMap.put(num, arrayMap.get(num) + 1);
      }
    }

    Entry<Integer, Integer> maxEntry = null;
    Entry<Integer, Integer> secondMaxEntry = null;
    for (Entry<Integer, Integer> entry : arrayMap.entrySet()) {
      if (maxEntry == null || maxEntry.getValue() < entry.getValue()) {
        maxEntry = entry;
      }
    }

    int maxValue = maxEntry.getValue();
    arrayMap.put(maxEntry.getKey(), 0);

    for (Entry<Integer, Integer> entry : arrayMap.entrySet()) {
      if (secondMaxEntry == null || secondMaxEntry.getValue() < entry.getValue()) {
        secondMaxEntry = entry;
      }
    }

    if (maxValue == secondMaxEntry.getValue()) {
      return -1;
    } else {
      return maxEntry.getKey();
    }
  }
}
