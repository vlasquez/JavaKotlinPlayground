package ArcadeMode.island_of_knowledge;

import java.util.List;

public class AvoidObstaclesJava {

 public static int avoidObstacles(List<Integer> list) {
    int jumps = 2;

    for (int i = 0; i<list.size();++i) {
      if(list.get(i)%jumps==0){
        i =-1;
        jumps++;
      }
    }

    return jumps;
  }
}
