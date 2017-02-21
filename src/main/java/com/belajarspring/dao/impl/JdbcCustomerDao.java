package com.belajarspring.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.belajarspring.dao.CustomerDao;
import com.belajarspring.model.Customer;
import com.mysql.fabric.xmlrpc.base.Data;

public class JdbcCustomerDao implements CustomerDao {
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(Customer customer) {
		String sql = "INSERT INTO CUSTOMER (CUST_ID, FULL_NAME, ADDRESS, EMAIL) VALUES (?, ?, ?, ?)";
		Connection conn = null;
		try{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getCustId());
			ps.setString(2, customer.getFullName());
			ps.setString(3, customer.getAddress());
			ps.setString(4, customer.getEmail());
			ps.executeUpdate();
			ps.close();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch (SQLException e) {
					// TODO: handle exception
				}
			}
		}
	}

	public Customer findByCustomerId(int custId) {
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custId);
			Customer customer = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer = new Customer(
					rs.getInt("CUST_ID"),
					rs.getString("FULL_NAME"),
					rs.getString("ADDRESS"),
					rs.getString("EMAIL")
				);
			}
			rs.close();
			ps.close();
			return customer;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch (SQLException e) {
					// TODO: handle exception
				}
			}
		}
	}	
}
