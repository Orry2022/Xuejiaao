package com.example.flight.mapper;

import com.example.flight.entity.Passenger;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PassengerMapper{

    //查询所有乘客
    @Select("SELECT * FROM passenger")
    public List<Passenger> selectList();

    //根据乘客姓名和手机号查询  parameter(参数)
    @Select("SELECT * FROM passenger WHERE name=#{p_name} AND phone =#{phone}")
    public Passenger selectparams(
            @Param("p_name") String p_name,
            @Param("phone") String phone
    );

    //查找某账号下的乘客，返回是某账号的集合
    @Select("SELECT * FROM passenger WHERE User_name = #{User_name}")
    public List<Passenger> selectByUser_name(String User_name);

    //判断添加多少人
    @Insert("INSERT INTO passenger(p_name,Card_num,phone,User_name)"+
            "VALUES( #{P_name},#{Card_num},#{phone},#{User_name})")
    public int insert(Passenger passenger);

    //根据乘客编号删除
    @Delete("DELETE FROM passenger WHERE pid = #{pid}")
    public int deleteByPid(int pid);
}
