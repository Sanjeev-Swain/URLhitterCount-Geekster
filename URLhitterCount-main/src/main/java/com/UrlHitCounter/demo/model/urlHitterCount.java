package com.UrlHitCounter.demo.model;

public class urlHitterCount {

    private String userName;
    private int count;


    public int getCount() {
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public urlHitterCount(String userName, int count){
        this.userName = userName;
        this.count = count;
    }

    @Override
    public String toString() {
        return "urlHitterCount{" +
                "userName='" + userName + '\'' +
                ", hitcount=" + count +
                '}';
    }
}
