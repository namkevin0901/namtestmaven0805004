package com.test;

import org.testng.annotations.Test;

public class TestCase01 extends BaseClass {

    @Test
    public void TC01 () {
        System.out.println("This is testcase 01");
        String a = driver.getTitle();
        System.out.println("This is title" + a);
    }

    @Test
    public void TC02 () {
        System.out.println("This is testcase 02");
        String b = driver.getCurrentUrl();
        System.out.println("This is title" + b);
    }

    @Test
    public void TC03 () {
        System.out.println("This is testcase 03");
    }
}
