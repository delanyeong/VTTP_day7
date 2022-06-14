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

        

        myList.stream()
        .forEach((value)->{
            System.out.printf(">>> %d\n", value);
        });
    }
}
