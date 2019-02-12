package com.jp.excercises;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingLeaderBoard {

    static int[] leaderBoard = {100, 100, 50, 40, 40, 20, 10};
    static int[] alice = {5, 25, 50, 120};

    public static void main(String[] args) {

        climbingLeaderboard(leaderBoard, alice);

    }

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        List<Integer> result = new ArrayList<>();

        List<Integer> scoreList = Arrays.stream(scores).boxed().distinct().collect(Collectors.toList());

        System.out.println(scoreList);

        for (int a : alice) {

            int index = Collections.binarySearch(scoreList, a, Collections.reverseOrder());

            if(index < 0){
                result.add(index*-1);
            } else {
                result.add(index+1);
            }

        }

        result.stream().mapToInt(i->i).peek(i -> System.out.println(i)).toArray();

        return result.stream().mapToInt(i->i).toArray();
    }


}
