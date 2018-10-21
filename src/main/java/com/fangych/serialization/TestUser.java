package com.fangych.serialization;

import java.io.*;

public class TestUser {

    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setUserName("张三");
        user.setAge(12);
        user.setAddress("天安门");
        File file = new File("D:/user.txt");

        //序列化持久化对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(user);
        out.close();

        //反序列化，并得到对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Object userObj = in.readObject(); // 没有强制转换到Person类型
        UserB userB=(UserB)userObj;
        in.close();
        System.out.println(userB);
    }
}
