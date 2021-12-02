package com.company;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class NoiseData {

    ArrayList<Integer> noise = new ArrayList<Integer>();

    public ArrayList<Integer> noiseArray( ArrayList<Integer> mesures) throws FileNotFoundException {
        for (int j = 0; j < mesures.size() -2; j++){
            int sum = mesures.get(j) + mesures.get(j+1) + mesures.get(j+2);
            noise.add(sum);
        }
        return noise;
    }


    public void partTwo()  {
        UtilsService.increase(noise);
    }
}
