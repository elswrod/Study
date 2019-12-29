package com.car.model;

import java.sql.DriverManager;
import java.util.ArrayList;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;

/**
 * 汽车相关数据库操作
 * @author Administrator
 *
 */
public class CarDAO {

	public ArrayList<Car> listAll(){
		ArrayList<Car> cars = new  ArrayList<>();
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars","root","root");
			QueryRunner run =new QueryRunner(dataSource);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return cars;
	}
}
