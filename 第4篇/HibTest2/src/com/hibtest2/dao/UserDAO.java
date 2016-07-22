package com.hibtest2.dao;

import com.hibtest2.entity.Users;

public interface UserDAO {
	public void add(Users users);
	public void delete(Users users);
	public Users load(Integer id);
	public void update(Users users);
	public boolean validate(String loginName,String loginPwd);
}
