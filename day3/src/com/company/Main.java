package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
		OxygenRating c = new OxygenRating();
		ArrayList<String> test = c.readFile();
		c.power(test);
		c.value0();
		c.value1(test);
		c.value2(test);
		c.value3(test);
		c.value4(test);
		c.value5(test);
		c.value6(test);
		c.value7(test);
		c.value8(test);
		c.value9(test);
		c.value10(test);
		c.value11(test);
		c.result();
    }
}
