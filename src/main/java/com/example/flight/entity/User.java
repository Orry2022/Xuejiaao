package com.example.flight.entity;

/*
实体类POJO类()
 */
public class User{
    private String username;
    private String password;
    private Integer balance; //不用int，改成integer

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Integer getBalance(){
        return balance;
    }

    public void setBalance(Integer balance){
        this.balance = balance;
    }
}
