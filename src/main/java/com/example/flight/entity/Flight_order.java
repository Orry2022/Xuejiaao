package com.example.flight.entity;

import java.util.Date;

public class Flight_order{
    private Integer oid;
    private Date order_time;
    private Integer order_amount;
    private Integer order_status;
    private Integer fid;
    private Integer pid;

    public Integer getOid(){
        return oid;
    }

    public void setOid(Integer oid){
        this.oid = oid;
    }

    public Date getOrder_time(){
        return order_time;
    }

    public void setOrder_time(Date order_time){
        this.order_time = order_time;
    }

    public Integer getOrder_amount(){
        return order_amount;
    }

    public void setOrder_amount(Integer order_amount){
        this.order_amount = order_amount;
    }

    public Integer getOrder_status(){
        return order_status;
    }

    public void setOrder_status(Integer order_status){
        this.order_status = order_status;
    }

    public Integer getFid(){
        return fid;
    }

    public void setFid(Integer fid){
        this.fid = fid;
    }

    public Integer getPid(){
        return pid;
    }

    public void setPid(Integer pid){
        this.pid = pid;
    }
}
