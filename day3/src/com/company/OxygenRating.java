package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OxygenRating {

    ArrayList<String> bits = new ArrayList<String>();
    ArrayList<String[]> arrayList = new ArrayList<String[]>();
    ArrayList<Integer> oxygen = new ArrayList<Integer>();
    ArrayList<Integer> co2 = new ArrayList<Integer>();
    double resultO, resultC, result;
    int value11e0, value11e1;
    int valueO10e0, valueO10e1, valueC10e0, valueC10e1;
    int valueO9e0, valueO9e1, valueC9e0, valueC9e1;
    int valueO8e0, valueO8e1, valueC8e0, valueC8e1;
    int valueO7e0, valueO7e1, valueC7e0, valueC7e1;
    int valueO6e0, valueO6e1, valueC6e0, valueC6e1;
    int valueO5e0, valueO5e1, valueC5e0, valueC5e1;
    int valueO4e0, valueO4e1, valueC4e0, valueC4e1;
    int valueO3e0, valueO3e1, valueC3e0, valueC3e1;
    int valueO2e0, valueO2e1, valueC2e0, valueC2e1;
    int valueO1e0, valueO1e1, valueC1e0, valueC1e1;
    int valueO0e0, valueO0e1, valueC0e0, valueC0e1;

    public ArrayList<String> readFile() throws FileNotFoundException {
        String token1;
        Scanner file = new Scanner(new File("input.txt"));

        while (file.hasNext()) {
            token1 = file.nextLine();
            bits.add(token1);
        }
        file.close();
        return bits;
    }

    public void power(ArrayList<String> test) {
        for (int i = 0; i<test.size(); i++) {
            arrayList.add(test.get(i).split(""));

            if (Integer.valueOf(arrayList.get(i)[0]) == 0) {
                value11e0 += 1;
            } else
                value11e1 += 1;

        }
    }

    public void value0(){
        if (value11e0 > value11e1) {
            oxygen.add(0);
            co2.add(1);
        }
        else {
            oxygen.add(1);
            co2.add(0);
        }
    }

    public void value1(ArrayList<String> test){
        int t = 0;
        for (int i = 0; i<test.size(); i++) {
            t=Integer.valueOf(arrayList.get(i)[1]);
            if (Integer.valueOf(arrayList.get(i)[0]) == oxygen.get(0)){
                if (Integer.valueOf(arrayList.get(i)[1]) == 0) {
                    valueO10e0 += 1;
                } else
                    valueO10e1 += 1;
            }
            if (Integer.valueOf(arrayList.get(i)[0]) == co2.get(0)){
                if (Integer.valueOf(arrayList.get(i)[1]) == 0) {
                    valueC10e0 += 1;
                } else
                    valueC10e1 += 1;
            }
        }
        if (valueO10e0 > valueO10e1 && valueO10e1 != 0 && valueO10e0 != 0) {
            oxygen.add(0);
        }
        if (valueO10e0 <= valueO10e1 && valueO10e1 != 0 && valueO10e0 != 0) {
            oxygen.add(1);
        }
        if (valueO10e1 == 0 || valueO10e0 == 0) {
            oxygen.add(t);
        }
        if (valueC10e0 > valueC10e1 && valueC10e1 != 0 && valueC10e0 != 0) {
            co2.add(1);
        }
        if (valueC10e0 <= valueC10e1 && valueC10e1 != 0 && valueC10e0 != 0) {
            co2.add(0);
        }
        if (valueC10e1 == 0 || valueC10e0 == 0) {
            co2.add(t);
        }
    }

    public void value2(ArrayList<String> test){
        int t = 0;
        for (int i = 0; i<test.size(); i++) {
            t=Integer.valueOf(arrayList.get(i)[2]);
            if (Integer.valueOf(arrayList.get(i)[0]) == oxygen.get(0) && Integer.valueOf(arrayList.get(i)[1]) == oxygen.get(1)){
                if (Integer.valueOf(arrayList.get(i)[2]) == 0) {
                    valueO9e0 += 1;
                } else
                    valueO9e1 += 1;
            }
            if (Integer.valueOf(arrayList.get(i)[0]) == co2.get(0) && Integer.valueOf(arrayList.get(i)[1]) == co2.get(1)){
                if (Integer.valueOf(arrayList.get(i)[2]) == 0) {
                    valueC9e0 += 1;
                } else
                    valueC9e1 += 1;
            }
        }
        if (valueO9e0 > valueO9e1 && valueO9e1 != 0 && valueO9e0 != 0) {
            oxygen.add(0);
        }
        if (valueO9e0 <= valueO9e1 && valueO9e1 != 0 && valueO9e0 != 0) {
            oxygen.add(1);
        }
        if (valueO9e1 == 0 || valueO9e0 == 0) {
            oxygen.add(t);
        }
        if (valueC9e0 > valueC9e1&& valueC9e0 != 0 && valueC9e1 != 0) {
            co2.add(1);
        }
        if (valueC9e0 <= valueC9e1 && valueC9e0 != 0 && valueC9e1 != 0) {
            co2.add(0);
        }
        if (valueC9e1 == 0 || valueC9e0 == 0) {
            co2.add(t);
        }
    }

    public void value3(ArrayList<String> test){
        int t = 0;
        for (int i = 0; i<test.size(); i++) {
            t=Integer.valueOf(arrayList.get(i)[3]);
            if (Integer.valueOf(arrayList.get(i)[0]) == oxygen.get(0) && Integer.valueOf(arrayList.get(i)[1]) == oxygen.get(1) && Integer.valueOf(arrayList.get(i)[2]) == oxygen.get(2)){
                if (Integer.valueOf(arrayList.get(i)[3]) == 0) {
                    valueO8e0 += 1;
                } else
                    valueO8e1 += 1;
            }
            if (Integer.valueOf(arrayList.get(i)[0]) == co2.get(0) && Integer.valueOf(arrayList.get(i)[1]) == co2.get(1) && Integer.valueOf(arrayList.get(i)[2]) == co2.get(2)){
                if (Integer.valueOf(arrayList.get(i)[3]) == 0) {
                    valueC8e0 += 1;
                } else
                    valueC8e1 += 1;
            }
        }
        if (valueO8e0 > valueO8e1 && valueO8e1!=0 && valueO8e0!=0) {
            oxygen.add(0);
        }
        if (valueO8e0 <= valueO8e1 && valueO8e1!=0 && valueO8e0!=0) {
            oxygen.add(1);
        }
        if (valueO8e1 == 0 || valueO8e0 == 0) {
            oxygen.add(t);
        }
        if (valueC8e0 > valueC8e1 && valueC8e1!=0 && valueC8e0!=0 ) {
            co2.add(1);
        }
        if (valueC8e0 <= valueC8e1 && valueC8e1!=0 && valueC8e0!=0) {
            co2.add(0);
        }
        if (valueC8e1 == 0 || valueC8e0 == 0) {
            co2.add(t);
        }
    }

    public void value4(ArrayList<String> test){
        int t = 0;
        for (int i = 0; i<test.size(); i++) {
            t=Integer.valueOf(arrayList.get(i)[4]);
            if (Integer.valueOf(arrayList.get(i)[0]) == oxygen.get(0) && Integer.valueOf(arrayList.get(i)[1]) == oxygen.get(1) && Integer.valueOf(arrayList.get(i)[2]) == oxygen.get(2) && Integer.valueOf(arrayList.get(i)[3]) == oxygen.get(3)){
                if (Integer.valueOf(arrayList.get(i)[4]) == 0) {
                    valueO7e0 += 1;
                } else
                    valueO7e1 += 1;
            }
            if (Integer.valueOf(arrayList.get(i)[0]) == co2.get(0) && Integer.valueOf(arrayList.get(i)[1]) == co2.get(1) && Integer.valueOf(arrayList.get(i)[2]) == co2.get(2) && Integer.valueOf(arrayList.get(i)[3]) == co2.get(3)){
                if (Integer.valueOf(arrayList.get(i)[4]) == 0) {
                    valueC7e0 += 1;
                } else
                    valueC7e1 += 1;
            }
        }
        if (valueO7e0 > valueO7e1 && valueO7e1!=0 && valueO7e0!=0) {
            oxygen.add(0);
        }
        if (valueO7e0 <= valueO7e1 && valueO7e1!=0 && valueO7e0!=0) {
            oxygen.add(1);
        }
        if (valueO7e1 == 0 || valueO7e0 == 0) {
            oxygen.add(t);
        }
        if (valueC7e0 > valueC7e1 && valueC7e1!=0 && valueC7e0!=0) {
            co2.add(1);
        }
        if (valueC7e0 <= valueC7e1 && valueC7e1!=0 && valueC7e0!=0) {
            co2.add(0);
        }
        if (valueC7e1 == 0 || valueC7e0 == 0) {
            co2.add(t);
        }
        System.out.println(oxygen);
        System.out.println(co2);
    }

    public void value5(ArrayList<String> test){
        int t = 0;
        for (int i = 0; i<test.size(); i++) {
            t=Integer.valueOf(arrayList.get(i)[5]);
            if (Integer.valueOf(arrayList.get(i)[0]) == oxygen.get(0) && Integer.valueOf(arrayList.get(i)[1]) == oxygen.get(1) && Integer.valueOf(arrayList.get(i)[2]) == oxygen.get(2) && Integer.valueOf(arrayList.get(i)[3]) == oxygen.get(3) && Integer.valueOf(arrayList.get(i)[4]) == oxygen.get(4)){
                if (Integer.valueOf(arrayList.get(i)[5]) == 0) {
                    valueO6e0 += 1;
                } else
                    valueO6e1 += 1;
            }
            if (Integer.valueOf(arrayList.get(i)[0]) == co2.get(0) && Integer.valueOf(arrayList.get(i)[1]) == co2.get(1) && Integer.valueOf(arrayList.get(i)[2]) == co2.get(2) && Integer.valueOf(arrayList.get(i)[3]) == co2.get(3) && Integer.valueOf(arrayList.get(i)[4]) == co2.get(4)){
                if (Integer.valueOf(arrayList.get(i)[5]) == 0) {
                    valueC6e0 += 1;
                } else
                    valueC6e1 += 1;
            }
        }

        if (valueO6e0 > valueO6e1 && valueO6e1 != 0 && valueO6e0 != 0) {
            oxygen.add(0);
        }
        if (valueO6e0 <= valueO6e1 && valueO6e1 != 0 && valueO6e0 != 0) {
            oxygen.add(1);
        }
        if (valueO6e1 == 0 || valueO6e0 == 0) {
            oxygen.add(t);
        }
        if (valueC6e0 > valueC6e1 && valueC6e1 != 0 && valueC6e0 != 0) {
            co2.add(1);
        }
        if (valueC6e0 <= valueC6e1 && valueC6e1 != 0 && valueC6e0 != 0) {
            co2.add(0);
        }
        if (valueC6e1 == 0 || valueC6e0 == 0) {
            co2.add(t);
        }
    }

    public void value6(ArrayList<String> test){
        int t = 0;
        for (int i = 0; i<test.size(); i++) {
            t=Integer.valueOf(arrayList.get(i)[6]);
            if (Integer.valueOf(arrayList.get(i)[0]) == oxygen.get(0) && Integer.valueOf(arrayList.get(i)[1]) == oxygen.get(1) && Integer.valueOf(arrayList.get(i)[2]) == oxygen.get(2) && Integer.valueOf(arrayList.get(i)[3]) == oxygen.get(3) && Integer.valueOf(arrayList.get(i)[4]) == oxygen.get(4) && Integer.valueOf(arrayList.get(i)[5]) == oxygen.get(5)){
                if (Integer.valueOf(arrayList.get(i)[6]) == 0) {
                    valueO5e0 += 1;
                } else
                    valueO5e1 += 1;
            }
            if (Integer.valueOf(arrayList.get(i)[0]) == co2.get(0) && Integer.valueOf(arrayList.get(i)[1]) == co2.get(1) && Integer.valueOf(arrayList.get(i)[2]) == co2.get(2) && Integer.valueOf(arrayList.get(i)[3]) == co2.get(3) && Integer.valueOf(arrayList.get(i)[4]) == co2.get(4) && Integer.valueOf(arrayList.get(i)[5]) == co2.get(5)){
                if (Integer.valueOf(arrayList.get(i)[6]) == 0) {
                    valueC5e0 += 1;
                } else
                    valueC5e1 += 1;
            }
        }
        if (valueO5e0 > valueO5e1 && valueO5e1 != 0 && valueO5e0 != 0) {
            oxygen.add(0);
        }
        if (valueO5e0 <= valueO5e1 && valueO5e1 != 0 && valueO5e0 != 0) {
            oxygen.add(1);
        }
        if (valueO5e1 == 0 || valueO5e0 == 0) {
            oxygen.add(t);
        }
        if (valueC5e0 > valueC5e1 && valueC5e1 != 0 && valueC5e0 != 0) {
            co2.add(1);
        }
        if (valueC5e0 <= valueC5e1 && valueC5e1 != 0 && valueC5e0 != 0) {
            co2.add(0);
        }
        if (valueC5e1 == 0 || valueC5e0 == 0) {
            co2.add(t);
        }
    }

    public void value7(ArrayList<String> test){
        int t = 0;
        for (int i = 0; i<test.size(); i++) {
            t=Integer.valueOf(arrayList.get(i)[7]);
            if (Integer.valueOf(arrayList.get(i)[0]) == oxygen.get(0) && Integer.valueOf(arrayList.get(i)[1]) == oxygen.get(1) && Integer.valueOf(arrayList.get(i)[2]) == oxygen.get(2) && Integer.valueOf(arrayList.get(i)[3]) == oxygen.get(3) && Integer.valueOf(arrayList.get(i)[4]) == oxygen.get(4) && Integer.valueOf(arrayList.get(i)[5]) == oxygen.get(5) && Integer.valueOf(arrayList.get(i)[6]) == oxygen.get(6)){
                if (Integer.valueOf(arrayList.get(i)[7]) == 0) {
                    valueO4e0 += 1;
                } else
                    valueO4e1 += 1;
            }
            if (Integer.valueOf(arrayList.get(i)[0]) == co2.get(0) && Integer.valueOf(arrayList.get(i)[1]) == co2.get(1) && Integer.valueOf(arrayList.get(i)[2]) == co2.get(2) && Integer.valueOf(arrayList.get(i)[3]) == co2.get(3) && Integer.valueOf(arrayList.get(i)[4]) == co2.get(4) && Integer.valueOf(arrayList.get(i)[5]) == co2.get(5) && Integer.valueOf(arrayList.get(i)[6]) == co2.get(6)){
                if (Integer.valueOf(arrayList.get(i)[7]) == 0) {
                    valueC4e0 += 1;
                } else
                    valueC4e1 += 1;
            }
        }

        if (valueO4e0 > valueO4e1 && valueO4e1 != 0 && valueO4e0 != 0) {
            oxygen.add(0);
        }
        if (valueO4e0 <= valueO4e1 && valueO4e1 != 0 && valueO4e0 != 0) {
            oxygen.add(1);
        }
        if (valueO4e1 == 0 || valueO4e0 == 0) {
            oxygen.add(t);
        }
        if (valueC4e0 > valueC4e1 && valueC4e1 != 0 && valueC4e0 != 0) {
            co2.add(1);
        }
        if (valueC4e0 <= valueC4e1 && valueC4e1 != 0 && valueC4e0 != 0) {
            co2.add(0);
        }
        if (valueC4e1 == 0 || valueC4e0 == 0) {
            co2.add(t);
        }
    }

    public void value8(ArrayList<String> test){
        int tO = 0, tC = 0;
        for (int i = 0; i<test.size(); i++) {
            if (Integer.valueOf(arrayList.get(i)[0]) == oxygen.get(0) && Integer.valueOf(arrayList.get(i)[1]) == oxygen.get(1) && Integer.valueOf(arrayList.get(i)[2]) == oxygen.get(2) && Integer.valueOf(arrayList.get(i)[3]) == oxygen.get(3) && Integer.valueOf(arrayList.get(i)[4]) == oxygen.get(4) && Integer.valueOf(arrayList.get(i)[5]) == oxygen.get(5) && Integer.valueOf(arrayList.get(i)[6]) == oxygen.get(6) && Integer.valueOf(arrayList.get(i)[7]) == oxygen.get(7)){
                tO=Integer.valueOf(arrayList.get(i)[8]);
                if (Integer.valueOf(arrayList.get(i)[8]) == 0) {
                    valueO3e0 += 1;
                } else
                    valueO3e1 += 1;
            }
            if (Integer.valueOf(arrayList.get(i)[0]) == co2.get(0) && Integer.valueOf(arrayList.get(i)[1]) == co2.get(1) && Integer.valueOf(arrayList.get(i)[2]) == co2.get(2) && Integer.valueOf(arrayList.get(i)[3]) == co2.get(3) && Integer.valueOf(arrayList.get(i)[4]) == co2.get(4) && Integer.valueOf(arrayList.get(i)[5]) == co2.get(5) && Integer.valueOf(arrayList.get(i)[6]) == co2.get(6) && Integer.valueOf(arrayList.get(i)[7]) == co2.get(7)){
                tC=Integer.valueOf(arrayList.get(i)[8]);
                if (Integer.valueOf(arrayList.get(i)[8]) == 0) {
                    valueC3e0 += 1;
                } else
                    valueC3e1 += 1;
            }
        }
        if (valueO3e0 > valueO3e1 && valueO3e1 != 0 && valueO3e0 != 0) {
            oxygen.add(0);
        }
        if (valueO3e0 <= valueO3e1 && valueO3e1 != 0 && valueO3e0 != 0) {
            oxygen.add(1);
        }
        if (valueO3e1 == 0 || valueO3e0 == 0) {
            oxygen.add(tO);
        }
        if (valueC3e0 > valueC3e1 && valueC3e1 != 0 && valueC3e0 != 0) {
            co2.add(1);
        }
        if (valueC3e0 <= valueC3e1 && valueC3e1 != 0 && valueC3e0 != 0) {
            co2.add(0);
        }
        if (valueC3e1 == 0 || valueC3e0 == 0) {
            co2.add(tC);
        }
    }

    public void value9(ArrayList<String> test){
        int tO = 0, tC = 0;
        for (int i = 0; i<test.size(); i++) {
            if (Integer.valueOf(arrayList.get(i)[0]) == oxygen.get(0) && Integer.valueOf(arrayList.get(i)[1]) == oxygen.get(1) && Integer.valueOf(arrayList.get(i)[2]) == oxygen.get(2) && Integer.valueOf(arrayList.get(i)[3]) == oxygen.get(3) && Integer.valueOf(arrayList.get(i)[4]) == oxygen.get(4) && Integer.valueOf(arrayList.get(i)[5]) == oxygen.get(5) && Integer.valueOf(arrayList.get(i)[6]) == oxygen.get(6) && Integer.valueOf(arrayList.get(i)[7]) == oxygen.get(7) && Integer.valueOf(arrayList.get(i)[8]) == oxygen.get(8)){
                tO=Integer.valueOf(arrayList.get(i)[9]);
                if (Integer.valueOf(arrayList.get(i)[9]) == 0) {
                    valueO2e0 += 1;
                } else
                    valueO2e1 += 1;
            }
            if (Integer.valueOf(arrayList.get(i)[0]) == co2.get(0) && Integer.valueOf(arrayList.get(i)[1]) == co2.get(1) && Integer.valueOf(arrayList.get(i)[2]) == co2.get(2) && Integer.valueOf(arrayList.get(i)[3]) == co2.get(3) && Integer.valueOf(arrayList.get(i)[4]) == co2.get(4) && Integer.valueOf(arrayList.get(i)[5]) == co2.get(5) && Integer.valueOf(arrayList.get(i)[6]) == co2.get(6) && Integer.valueOf(arrayList.get(i)[7]) == co2.get(7) && Integer.valueOf(arrayList.get(i)[8]) == co2.get(8)){
                tC=Integer.valueOf(arrayList.get(i)[9]);
                if (Integer.valueOf(arrayList.get(i)[9]) == 0) {
                    valueC2e0 += 1;
                } else
                    valueC2e1 += 1;
            }
        }
        if (valueO2e0 > valueO2e1 && valueO2e1 != 0 && valueO2e0 != 0) {
            oxygen.add(0);
        }
        if (valueO2e0 <= valueO2e1 && valueO2e1 != 0 && valueO2e0 != 0) {
            oxygen.add(1);
        }
        if (valueO2e1 == 0 || valueO2e0 == 0) {
            oxygen.add(tO);
        }
        if (valueC2e0 > valueC2e1 && valueC2e1 != 0 && valueC2e0 != 0) {
            co2.add(1);
        }
        if (valueC2e0 <= valueC2e1 && valueC2e1 != 0 && valueC2e0 != 0) {
            co2.add(0);
        }
        if (valueC2e1 == 0 || valueC2e0 == 0) {
            co2.add(tC);
        }
    }

    public void value10(ArrayList<String> test){
        int tO = 0, tC = 0;
        for (int i = 0; i<test.size(); i++) {
            if (Integer.valueOf(arrayList.get(i)[0]) == oxygen.get(0) && Integer.valueOf(arrayList.get(i)[1]) == oxygen.get(1) && Integer.valueOf(arrayList.get(i)[2]) == oxygen.get(2) && Integer.valueOf(arrayList.get(i)[3]) == oxygen.get(3) && Integer.valueOf(arrayList.get(i)[4]) == oxygen.get(4) && Integer.valueOf(arrayList.get(i)[5]) == oxygen.get(5) && Integer.valueOf(arrayList.get(i)[6]) == oxygen.get(6) && Integer.valueOf(arrayList.get(i)[7]) == oxygen.get(7) && Integer.valueOf(arrayList.get(i)[8]) == oxygen.get(8) && Integer.valueOf(arrayList.get(i)[9]) == oxygen.get(9)){
                tO=Integer.valueOf(arrayList.get(i)[10]);
                if (Integer.valueOf(arrayList.get(i)[10]) == 0) {
                    valueO1e0 += 1;
                } else
                    valueO1e1 += 1;
            }
            if (Integer.valueOf(arrayList.get(i)[0]) == co2.get(0) && Integer.valueOf(arrayList.get(i)[1]) == co2.get(1) && Integer.valueOf(arrayList.get(i)[2]) == co2.get(2) && Integer.valueOf(arrayList.get(i)[3]) == co2.get(3) && Integer.valueOf(arrayList.get(i)[4]) == co2.get(4) && Integer.valueOf(arrayList.get(i)[5]) == co2.get(5) && Integer.valueOf(arrayList.get(i)[6]) == co2.get(6) && Integer.valueOf(arrayList.get(i)[7]) == co2.get(7) && Integer.valueOf(arrayList.get(i)[8]) == co2.get(8) && Integer.valueOf(arrayList.get(i)[9]) == co2.get(9)){
                tC=Integer.valueOf(arrayList.get(i)[10]);
                if (Integer.valueOf(arrayList.get(i)[10]) == 0) {
                    valueC1e0 += 1;
                } else
                    valueC1e1 += 1;
            }
        }
        if (valueO1e0 > valueO1e1 && valueO1e1 != 0 && valueO1e0 != 0) {
            oxygen.add(0);
        }
        if (valueO1e0 <= valueO1e1 && valueO1e1 != 0 && valueO1e0 != 0) {
            oxygen.add(1);
        }
        if (valueO1e1 == 0 || valueO1e0 == 0) {
            oxygen.add(tO);
        }
        if (valueC1e0 > valueC1e1 && valueC1e1 != 0 && valueC1e0 != 0) {
            co2.add(1);
        }
        if (valueC1e0 <= valueC1e1 && valueC1e1 != 0 && valueC1e0 != 0) {
            co2.add(0);
        }
        if (valueC1e1 == 0 || valueC1e0 == 0) {
            co2.add(tC);
        }
    }

    public void value11(ArrayList<String> test){
        int tO = 0, tC = 0;
        for (int i = 0; i<test.size(); i++) {
            if (Integer.valueOf(arrayList.get(i)[0]) == oxygen.get(0) && Integer.valueOf(arrayList.get(i)[1]) == oxygen.get(1) && Integer.valueOf(arrayList.get(i)[2]) == oxygen.get(2) && Integer.valueOf(arrayList.get(i)[3]) == oxygen.get(3) && Integer.valueOf(arrayList.get(i)[4]) == oxygen.get(4) && Integer.valueOf(arrayList.get(i)[5]) == oxygen.get(5) && Integer.valueOf(arrayList.get(i)[6]) == oxygen.get(6) && Integer.valueOf(arrayList.get(i)[7]) == oxygen.get(7) && Integer.valueOf(arrayList.get(i)[8]) == oxygen.get(8) && Integer.valueOf(arrayList.get(i)[9]) == oxygen.get(9) && Integer.valueOf(arrayList.get(i)[10]) == oxygen.get(10)){
                tO=Integer.valueOf(arrayList.get(i)[11]);
                if (Integer.valueOf(arrayList.get(i)[11]) == 0) {
                    valueO0e0 += 1;
                } else
                    valueO0e1 += 1;
            }
            if (Integer.valueOf(arrayList.get(i)[0]) == co2.get(0) && Integer.valueOf(arrayList.get(i)[1]) == co2.get(1) && Integer.valueOf(arrayList.get(i)[2]) == co2.get(2) && Integer.valueOf(arrayList.get(i)[3]) == co2.get(3) && Integer.valueOf(arrayList.get(i)[4]) == co2.get(4) && Integer.valueOf(arrayList.get(i)[5]) == co2.get(5) && Integer.valueOf(arrayList.get(i)[6]) == co2.get(6) && Integer.valueOf(arrayList.get(i)[7]) == co2.get(7) && Integer.valueOf(arrayList.get(i)[8]) == co2.get(8) && Integer.valueOf(arrayList.get(i)[9]) == co2.get(9) && Integer.valueOf(arrayList.get(i)[10]) == co2.get(10)){
                tC=Integer.valueOf(arrayList.get(i)[11]);
                if (Integer.valueOf(arrayList.get(i)[11]) == 0) {
                    valueC0e0 += 1;
                } else
                    valueC0e1 += 1;
            }
        }
        if (valueO0e0 > valueO0e1 && valueO0e1 != 0 && valueO0e0 != 0) {
            oxygen.add(0);
        }
        if (valueO0e0 <= valueO0e1 && valueO0e1 != 0 && valueO0e0 != 0) {
            oxygen.add(1);
        }
        if (valueO0e1 == 0 || valueO0e0 == 0) {
            oxygen.add(tO);
        }
        if (valueC0e0 > valueC0e1 && valueC0e1 != 0 && valueC0e0 != 0) {
            co2.add(1);
        }
        if (valueC0e0 <= valueC0e1 && valueC0e1 != 0 && valueC0e0 != 0) {
            co2.add(0);
        }
        if (valueC0e1 == 0 || valueC0e0 == 0) {
            co2.add(tC);
        }
        System.out.println(oxygen);
        System.out.println(co2);
    }

    public void result(){
//        resultO = (oxygen.get(0)*Math.pow(2,4)) + (oxygen.get(1)*Math.pow(2,3)) + (oxygen.get(2)*Math.pow(2,2)) + (oxygen.get(3)*Math.pow(2,1)) + (oxygen.get(4)*Math.pow(2,0));
//        resultC = (co2.get(0)*Math.pow(2,4)) + (co2.get(1)*Math.pow(2,3)) + (co2.get(2)*Math.pow(2,2)) + (co2.get(3)*Math.pow(2,1)) + (co2.get(4)*Math.pow(2,0));

        resultO = (oxygen.get(0)*Math.pow(2,11)) + (oxygen.get(1)*Math.pow(2,10)) + (oxygen.get(2)*Math.pow(2,9)) + (oxygen.get(3)*Math.pow(2,8)) + (oxygen.get(4)*Math.pow(2,7)) + (oxygen.get(5)*Math.pow(2,6)) + (oxygen.get(6)*Math.pow(2,5)) +(oxygen.get(7)*Math.pow(2,4)) + (oxygen.get(8)*Math.pow(2,3)) + (oxygen.get(9)*Math.pow(2,2)) + (oxygen.get(10)*Math.pow(2,1)) + (oxygen.get(11)*Math.pow(2,0));
        resultC = (co2.get(0)*Math.pow(2,11)) + (co2.get(1)*Math.pow(2,10)) + (co2.get(2)*Math.pow(2,9)) + (co2.get(3)*Math.pow(2,8)) + (co2.get(4)*Math.pow(2,7)) + (co2.get(5)*Math.pow(2,6)) + (co2.get(6)*Math.pow(2,5)) +(co2.get(7)*Math.pow(2,4)) + (co2.get(8)*Math.pow(2,3)) + (co2.get(9)*Math.pow(2,2)) + (co2.get(10)*Math.pow(2,1)) + (co2.get(11)*Math.pow(2,0));

        result = resultO * resultC;
//        System.out.println(resultO);
//        System.out.println(resultC);
        System.out.println(result);
    }

}
