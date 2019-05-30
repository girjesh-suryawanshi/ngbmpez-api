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


}
