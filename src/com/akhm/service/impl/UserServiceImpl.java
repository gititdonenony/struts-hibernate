package com.akhm.service.impl;

import com.akhm.dao.UserDAO;
import com.akhm.dao.impl.UserDAOImpl;
import com.akhm.dao.model.UserTl;
import com.akhm.service.UserService;
import com.akhm.service.dto.UserDTO;
import com.akhm.util.FactoryUtils;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	public UserServiceImpl() {
		this.userDAO = new UserDAOImpl();
	}

	public Integer saveUser(UserDTO userDTO) {
		Integer userId = 0;
		try {
			if (userDTO != null) {
				UserTl userTl = FactoryUtils.convertUserDtoToUserTl(userDTO);
				if (userTl != null) {
					userId = userDAO.insertUser(userTl);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userId;
	}
}
