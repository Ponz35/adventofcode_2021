package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Conso {
    ArrayList<String> bits = new ArrayList<String>();
    ArrayList<String[]> arrayList = new ArrayList<String[]>();
    ArrayList<Integer> gamma = new ArrayList<Integer>();
    ArrayList<Integer> epsilon = new ArrayList<Integer>();
    double resultG, resultE, result;
    int value11e0, value11e1;
    int value10e0, value10e1;
    int value9e0, value9e1;
    int value8e0, value8e1;
    int value7e0, value7e1;
    int value6e0, value6e1;
    int value5e0, value5e1;
    int value4e0, value4e1;
    int value3e0, value3e1;
    int value2e0, value2e1;
    int value1e0, value1e1;
    int value0e0, value0e1;
    public ArrayList<String> readFile() throws FileNotFoundException {
        String token1;
        Scanner file = new Scanner(new File("input.txt"));

        while (file.hasNext()) {
            token1 = file.nextLine();
            bits.add(token1);
        }
        file.close();
        //System.out.println(bits);
        return bits;
    }

    public void power(ArrayList<String> test) {
        for (int i = 0; i<test.size(); i++){
            arrayList.add(test.get(i).split(""));

            if (Integer.valueOf(arrayList.get(i)[0]) == 0){
                value11e0 += 1;
            }
            else
                value11e1 += 1;

            if (Integer.valueOf(arrayList.get(i)[1]) == 0){
                value10e0 += 1;
            }
            else
                value10e1 += 1;

            if (Integer.valueOf(arrayList.get(i)[2]) == 0){
                value9e0 += 1;
            }
            else
                value9e1 += 1;

            if (Integer.valueOf(arrayList.get(i)[3]) == 0){
                value8e0 += 1;
            }
            else
                value8e1 += 1;

            if (Integer.valueOf(arrayList.get(i)[4]) == 0){
                value7e0 += 1;
            }
            else
                value7e1 += 1;

            if (Integer.valueOf(arrayList.get(i)[5]) == 0){
                value6e0 += 1;
            }
            else
                value6e1 += 1;

            if (Integer.valueOf(arrayList.get(i)[6]) == 0){
                value5e0 += 1;
            }
            else
                value5e1 += 1;

            if (Integer.valueOf(arrayList.get(i)[7]) == 0){
                value4e0 += 1;
            }
            else
                value4e1 += 1;

            if (Integer.valueOf(arrayList.get(i)[8]) == 0){
                value3e0 += 1;
            }
            else
                value3e1 += 1;

            if (Integer.valueOf(arrayList.get(i)[9]) == 0){
                value2e0 += 1;
            }
            else
                value2e1 += 1;

            if (Integer.valueOf(arrayList.get(i)[10]) == 0){
                value1e0 += 1;
            }
            else
                value1e1 += 1;

            if (Integer.valueOf(arrayList.get(i)[11]) == 0){
                value0e0 += 1;
            }
            else
                value0e1 += 1;
        }
    }

    public void calcul(){
        if (value11e0 > value11e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }

        if (value10e0 > value10e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }
        if (value9e0 > value9e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }
        if (value8e0 > value8e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }
        if (value7e0 > value7e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }
        if (value6e0 > value6e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }
        if (value5e0 > value5e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }
        if (value4e0 > value4e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }
        if (value3e0 > value3e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }
        if (value2e0 > value2e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }
        if (value1e0 > value1e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }
        if (value0e0 > value0e1) {
            gamma.add(0);
            epsilon.add(1);
        }
        else {
            gamma.add(1);
            epsilon.add(0);
        }

        resultG = (gamma.get(0)*Math.pow(2,11)) + (gamma.get(1)*Math.pow(2,10)) + (gamma.get(2)*Math.pow(2,9)) + (gamma.get(3)*Math.pow(2,8)) + (gamma.get(4)*Math.pow(2,7)) + (gamma.get(5)*Math.pow(2,6)) + (gamma.get(6)*Math.pow(2,5)) +(gamma.get(7)*Math.pow(2,4)) + (gamma.get(8)*Math.pow(2,3)) + (gamma.get(9)*Math.pow(2,2)) + (gamma.get(10)*Math.pow(2,1)) + (gamma.get(11)*Math.pow(2,0));
        resultE = (epsilon.get(0)*Math.pow(2,11)) + (epsilon.get(1)*Math.pow(2,10)) + (epsilon.get(2)*Math.pow(2,9)) + (epsilon.get(3)*Math.pow(2,8)) + (epsilon.get(4)*Math.pow(2,7)) + (epsilon.get(5)*Math.pow(2,6)) + (epsilon.get(6)*Math.pow(2,5)) +(epsilon.get(7)*Math.pow(2,4)) + (epsilon.get(8)*Math.pow(2,3)) + (epsilon.get(9)*Math.pow(2,2)) + (epsilon.get(10)*Math.pow(2,1)) + (epsilon.get(11)*Math.pow(2,0));

        result = resultG * resultE;
        System.out.println(result);
    }
}
