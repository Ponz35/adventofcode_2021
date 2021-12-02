package com.company;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Mesure m = new Mesure();
        NoiseData n = new NoiseData();
        m.partOne();
        ArrayList<Integer> table = m.readFile();
        n.noiseArray(table);
        n.partTwo();
    }
}
