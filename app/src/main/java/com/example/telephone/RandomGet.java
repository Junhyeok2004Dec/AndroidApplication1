package com.example.telephone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomGet {


    private int total;
    Random random;

    public ArrayList<Integer> output;

    public ArrayList<Integer> getStudentID(int total, int outputCount) {

        random = new Random(System.currentTimeMillis());


        ArrayList<Integer> result = new ArrayList();



        for (int i = 0; i < outputCount; i++) {
            result.add(random.nextInt(total + 1));
        }

        return result;
    }


    public ArrayList getRandomSubset(int total, ArrayList list) {
        int size = list.size();

        if (total >= size) {
            return new ArrayList(list);
        }

        ArrayList shuffledList = new ArrayList(list);
        Collections.shuffle(shuffledList);

        ArrayList result = new ArrayList();
        for (int i = 0; i < total; i++) {
            result.add(shuffledList.get(i));
        }

        return result;
    }
}
