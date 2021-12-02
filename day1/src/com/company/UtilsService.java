package com.company;

import java.util.ArrayList;

public class UtilsService {

    public static void increase(ArrayList<Integer> liste){
        ArrayList<Boolean> increase = new ArrayList<Boolean>();
        int i;
        for (i=0; i < liste.size()-1; i++){
            if (liste.get(i) < liste.get(i+1)){
                increase.add(true);
            }
        }
        System.out.println(increase.size());
    }
}
