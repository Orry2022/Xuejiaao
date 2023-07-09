package com.example.flight.entity;

public class Passenger{
    private Integer pid;
    private String p_name;
    private String Card_num;
    private String phone;
    private String User_name;

    public Integer getPid(){
        return pid;
    }

    public void setPid(Integer pid){
        this.pid = pid;
    }

    public String getP_name(){
        return p_name;
    }

    public void setP_name(String p_name){
        this.p_name = p_name;
    }

    public String getCard_num(){
        return Card_num;
    }

    public void setCard_num(String card_num){
        Card_num = card_num;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getUser_name(){
        return User_name;
    }

    public void setUser_name(String user_name){
        User_name = user_name;
    }
}
