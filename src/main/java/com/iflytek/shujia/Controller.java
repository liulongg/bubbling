package com.iflytek.shujia;

import com.iflytek.shujia.pojo.Persion;

public class Controller {
    public static void main(String[] args) {
        Persion persion=new Persion();
        persion.setId(1);
        persion.setName("name");
        persion.setSex("name");

        System.out.println(persion.getSex());
        System.out.println(persion.getName());
    }
}
