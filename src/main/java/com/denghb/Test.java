package com.denghb;

public class Test {


    public void output() {
        String s = ""/**{
         hello world,
         eorm

         }*/;

        String sql = ""/**{
         Select * from tb_user
         }*/;

        System.out.println(s);
        System.out.println(sql);
    }


    public static void main(String[] args) {

        new Test().output();


    }
}
