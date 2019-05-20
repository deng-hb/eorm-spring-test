package com.denghb;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {


    public void output() {
        String s = ""/*{
         hello world,
         eorm
         Select * from tb_user
         }*/;

        String s2 = ""/*{

        asdasdasdadas

         }*/;

        System.out.println(s);
        System.out.println(s2);

        TestModel test = new TestModel();

    }
}