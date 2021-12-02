package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Position {

    ArrayList<String> plancourse = new ArrayList<String>();
    ArrayList<String> position = new ArrayList<String>();
    ArrayList<Integer> number = new ArrayList<Integer>();

    public ArrayList<String> readFile() throws FileNotFoundException {
        String token1;
        Scanner file = new Scanner(new File("input.txt"));

        while (file.hasNext()) {
            token1 = file.next();
            plancourse.add(token1);
        }
        file.close();
        return plancourse;
    }

    public ArrayList<String> positionArray(ArrayList<String> p){
        for (int i = 0; i < p.size(); i = i+2){
            position.add(p.get(i));
        }
        return position;
    }

    public ArrayList<Integer> numberArray(ArrayList<String> n){
        for (int i = 1; i < n.size(); i = i+2){
            number.add(Integer.valueOf(n.get(i)));
        }
        return number;
    }

    public int calcul (ArrayList<String> position, ArrayList<Integer> number){
        int horizontal = 0, depth = 0, total = 0;
        for (int i = 0; i<number.size(); i++){
            String p = position.get(i);
            int n = number.get(i);
            switch (p){
                case "forward":
                    horizontal += n;
                    break;
                case "down":
                    depth += n;
                    break;
                case "up":
                    depth -= n;
                    break;
            }

        }
        return total = horizontal*depth;
    }


}
