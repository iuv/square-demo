package com.jisuye;

import com.jisuye.annotations.SquareApplication;

import static com.jisuye.core.SquareApplication.run;

@SquareApplication
public class T {
    public static void main(String args[]){
        run(T.class, args);
    }
}
