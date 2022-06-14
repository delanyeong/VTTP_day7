package vttp2022.day07;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ColMain {
    public static void main(String[] args) {
        Random rand = new SecureRandom();
        List<Integer> myList = new LinkedList<>();
        for (int i = 0 ; i <100 ; i++) 
        myList.add(rand.nextInt(100));

        System.out.println(myList);

        int result = 0;
        int count =0;
        for (int i = 0 ; i < myList.size() ; i++) {
        int v = myList.get(i);
        //filter
        if (0 != (v%2))
        continue;
        //map
        System.out.printf(" %d\n", myList.get(i)+1);
        result += myList.get(i);
        }

        System.out.println("result=" + result);
        
         
        List<String> intList = myList.stream()
        .filter(v -> 0 == (v%2))
        .map(v -> v+1)
        .reduce(0,(x,y) -> x+y)
        .toList();
        
        System.out.println(intList);
        
        
        // .forEach((value) -> {
        //     System.out.printf("forEach %d\n", value);
        //});
    }
}
