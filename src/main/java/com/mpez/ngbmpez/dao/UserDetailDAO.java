package com.mpez.ngbmpez.dao;

import com.mpez.ngbmpez.interfaces.UserDetailInterface;
import com.mpez.ngbmpez.repository.UserDetailRepository;
import com.mpez.ngbmpez.utility.GlobalResource;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailDAO {


    private Logger logger = GlobalResource.getLogger(UserDetailDAO.class);

    @Autowired
    UserDetailRepository userDetailRepository;

    public List<? extends UserDetailInterface> getAllUser() {

        String methodName = "getAllUser()";
        logger.info(methodName, "called");
        List<? extends UserDetailInterface> userDetailInterface = null;
        userDetailInterface = userDetailRepository.findAll();
        return userDetailInterface;

    }


    public UserDetailInterface postUserDetail(UserDetailInterface userDetailInterface) {
        String methodName = "postUserDetail()";
        logger.info(methodName, "called");
        UserDetailInterface userDetailInterface1 = null;
        userDetailInterface1 =userDetailRepository.save(userDetailInterface);
        return userDetailInterface1;
    }

    public UserDetailInterface getUserByUserId(String userId) {
        String methodName = "getUserByUserId()";
        logger.info(methodName, "called");

        UserDetailInterface userDetailInterface = null;

        userDetailInterface = userDetailRepository.findByUserId(userId);

        return userDetailInterface;

    }
}
