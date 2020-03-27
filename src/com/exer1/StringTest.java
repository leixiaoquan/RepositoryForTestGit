package com.exer1;


import org.junit.Test;

/**
 * StringTest
 *
 * @Author: 雷孝权
 * @CreateTime: 2020-02-27
 * @Description:
 */
public class StringTest {

    @Test
    public void test1(){
        String aa = "Shenmeguienmegui";
        String st = method(aa);
        System.out.println(st);
    }
    String method(String origin){
        origin += origin.substring(2);
        return origin;
    }
}
