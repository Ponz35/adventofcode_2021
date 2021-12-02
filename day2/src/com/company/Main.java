package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Position p = new Position();
        ArrayList<String> tableau = p.readFile();
        ArrayList<String> position = p.positionArray(tableau);
        ArrayList<Integer> number = p.numberArray(tableau);
        p.calcul(position, number);

    }
}
