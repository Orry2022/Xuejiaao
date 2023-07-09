package com.example.flight.entity;

import java.util.Date;

public class Flight{
    private Integer fid;
    private Integer flight_num;
    private Date flight_date;
    private String departure;
    private String arrival_city;
    private String departure_time;
    private String arrival_time;
    private Integer ticket_price;
    private Integer tick_left;

    public Integer getFid(){
        return fid;
    }

    public void setFid(Integer fid){
        this.fid = fid;
    }

    public Integer getFlight_num(){
        return flight_num;
    }

    public void setFlight_num(Integer flight_num){
        this.flight_num = flight_num;
    }

    public Date getFlight_date(){
        return flight_date;
    }

    public void setFlight_date(Date flight_date){
        this.flight_date = flight_date;
    }

    public String getDeparture(){
        return departure;
    }

    public void setDeparture(String departure){
        this.departure = departure;
    }

    public String getArrival_city(){
        return arrival_city;
    }

    public void setArrival_city(String arrival_city){
        this.arrival_city = arrival_city;
    }

    public String getDeparture_time(){
        return departure_time;
    }

    public void setDeparture_time(String departure_time){
        this.departure_time = departure_time;
    }

    public String getArrival_time(){
        return arrival_time;
    }

    public void setArrival_time(String arrival_time){
        this.arrival_time = arrival_time;
    }

    public Integer getTicket_price(){
        return ticket_price;
    }

    public void setTicket_price(Integer ticket_price){
        this.ticket_price = ticket_price;
    }

    public Integer getTick_left(){
        return tick_left;
    }

    public void setTick_left(Integer tick_left){
        this.tick_left = tick_left;
    }
}
