package com.belajarspring.dao;

import com.belajarspring.model.Customer;

//DAO (Data Access Object). kelas DAO ini untuk setiap Model

public interface CustomerDao {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
