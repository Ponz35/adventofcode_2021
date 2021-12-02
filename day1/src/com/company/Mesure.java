package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mesure {

    ArrayList<Integer> mesures = new ArrayList<Integer>();

    public ArrayList<Integer> readFile() throws FileNotFoundException {
        int token1;
        Scanner file = new Scanner(new File("input.txt"));

        while (file.hasNext()) {
            token1 = Integer.parseInt(file.nextLine());
            mesures.add(token1);
        }
        file.close();
        return mesures;
    }

    public void partOne(){
        UtilsService.increase(mesures);
    }

}
