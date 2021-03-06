package com.camnter.test.sync;

/**
 * Description：Student
 * Created by：CaMnter
 */

public class Student {

    int number = 0;
    String name = "";


    public void setNumber(int n) {
        synchronized (name) {
            this.number = n;
            System.out.println(
                "Thread :" + Thread.currentThread().getId() + "  #    setNumber    " + this.number);
            System.out.println(
                "Thread :" + Thread.currentThread().getId() + "  #    setNumber  sleep  start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                "Thread :" + Thread.currentThread().getId() + "  #    setNumber  sleep  end");
        }
    }


    public void setName(String s) {
        synchronized (name) {
            this.name = s;
            System.out.println(
                "Thread :" + Thread.currentThread().getId() + "  #    setName    " + this.name);
            System.out.println(
                "Thread :" + Thread.currentThread().getId() + "  #    setName  sleep  start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                "Thread :" + Thread.currentThread().getId() + "  #    setName  sleep  end");
        }

    }
}
