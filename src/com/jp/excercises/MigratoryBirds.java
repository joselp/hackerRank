package com.jp.excercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MigratoryBirds {

    private static List<Integer> types = Arrays.asList(2,1,2,3,4,5,1,2,3,1,2);

    public static void main(String[] args) {
        System.out.println(migratoryBirds(types));
    }


    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Long> total = arr.stream().sorted().collect(Collectors.groupingBy(t -> t, Collectors.counting()));

        long max = (total.values().stream().mapToLong(i -> i).max().getAsLong());
        int type = -1;


        for (Integer k: total.keySet()) {
            if(total.get(k) == max){
                type = k;
                break;
            }
        }

        return type;
    }

}
