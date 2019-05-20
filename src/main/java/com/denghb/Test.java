package com.denghb;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    private static String ads = ""/*{
     你好啊
     }*/;

    private final static String _TEST = ""/*{
     真的啊？
     }*/;


    public void output() {
        String s = ""/*{
         hello world,
         eorm

         }*/;

        String sql = ""/*{
         Select * from tb_user
         }*/;

        System.out.println(s);
        System.out.println(sql);
    }


    private class A {
        private String s = ""/*{
            As
        }*/;
    }

    public static void main(String[] args) {

        new Test().output();
        log.info("aß");

    }
}
