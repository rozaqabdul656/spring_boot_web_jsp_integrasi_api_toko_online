package com.main.dao;

import java.util.List;

import com.main.model.Admin;

public interface DaoAdmin {
	void insertAdmin(Admin adm);
	List<Admin> getAllAdmin();
	Admin getAdminById(String id);
}
