package com.akhm.dao.impl;

import org.apache.struts.actions.DownloadAction;

import com.akhm.dao.UserDAO;
import com.akhm.dao.model.UserTl;
import com.akhm.util.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	public Integer insertUser(UserTl userTl) {
		Integer userId = 0;
		try {
			userId = (Integer) HibernateUtil.save(userTl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userId;
	}
}
