package com.mpez.ngbmpez.services;

import com.mpez.ngbmpez.beans.UserDetail;
import com.mpez.ngbmpez.controller.UserDetailController;
import com.mpez.ngbmpez.dao.UserDetailDAO;
import com.mpez.ngbmpez.interfaces.UserDetailInterface;
import com.mpez.ngbmpez.utility.GlobalResource;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailService {

    private Logger logger = GlobalResource.getLogger(UserDetailService.class);

    @Autowired
    UserDetailDAO userDetailDAO;

    public List<? extends UserDetailInterface> getAllUser() {
        String methodName = "getAllUser()";
        logger.info(methodName, "called");
        List<? extends UserDetailInterface> userDetailInterfaces = null;
        userDetailInterfaces = userDetailDAO.getAllUser();
        return userDetailInterfaces;

    }

    public UserDetailInterface postUserDetail(UserDetailInterface userDetailInterface) {
        String methodName = "postUserDetail()";
        logger.info(methodName, "called");
        UserDetailInterface userDetailInterface1 = null;
        if(userDetailInterface!= null){
            userDetailInterface1 = userDetailDAO.postUserDetail(userDetailInterface);
        }
      return userDetailInterface1;
    }

    public UserDetailInterface getUserByUserId(String userId) {
        String methodName = "getUserByUserId()";
        logger.info(methodName, "called");
        UserDetailInterface userDetailInterface = null;

        if(userId != null){
            userDetailInterface= userDetailDAO.getUserByUserId(userId);
        }

      return  userDetailInterface;
    }
}
