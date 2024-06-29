package com.akhm.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.akhm.action.form.AddUserActionForm;
import com.akhm.dao.model.UserTl;
import com.akhm.service.UserService;
import com.akhm.service.dto.UserDTO;
import com.akhm.service.impl.UserServiceImpl;
import com.akhm.util.DateUtils;

public class AddUserAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String target = "Success";
		AddUserActionForm addUserForm = (AddUserActionForm) form;
		UserDTO userDTO = new UserDTO();
		userDTO.setFirstName(addUserForm.getFirstName());
		userDTO.setLastName(addUserForm.getLastName());
		userDTO.setEmailId(addUserForm.getEmailId());
		userDTO.setMobileNumber(addUserForm.getMobileNumber());
		userDTO.setPassWord(addUserForm.getPassWord());
		if (addUserForm.getDob() != null) {
			userDTO.setDob(DateUtils.convertStringToDate(addUserForm.getDob()));
		}
		UserService userService = new UserServiceImpl();
		Integer userId = userService.saveUser(userDTO);
		if (userId == null || userId < 0) {
			target = "Fail";
			
		}

		return mapping.findForward(target);
	}
}
