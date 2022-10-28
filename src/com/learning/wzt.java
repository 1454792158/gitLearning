package com.learning;

import com.animal.Animal;

public class wzt {

    static final String TAG = "wzt";
    public static void main(String[] args) {
        Animal dag = new Animal("wcz",12);
        String str = dag.run();
        System.out.println(TAG);
        System.out.println(str);
    }
}
