package com.test.test;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcTest1 {
    /**JDBC操作数据库流程
     * 注册驱动
     * 告知jvm使用哪个数据库
     * 获得链接
     * 使用jdbc中的类完成对数据库的连接
     * 获取执行平台
     * 通过连接对象夺取对sql语句的执行平台
     * 执行sql语句
     * 获取执行结果
     * 关闭连接释放资源
     */
    public static void main(String[] args) throws SQLException {

        //注册驱动
        DriverManager.registerDriver(new Driver());
        //获得连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://lyxystudent.mysql.rds.aliyuncs.com:3306/zjh_student","root0000","root0000");
        if(connection != null){
            System.out.println("连接成功");
        }else {
            System.out.println("连接失败");;
        }
        //获取执行平台
        Statement statement = connection.createStatement();
        statement.executeUpdate("delete from city where id =2");
    }
}
