package com.sunglowsys;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
    public static void main(String[] args) {
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        String s = b.encode("amit@123");
        System.out.println(s);
    }
}
