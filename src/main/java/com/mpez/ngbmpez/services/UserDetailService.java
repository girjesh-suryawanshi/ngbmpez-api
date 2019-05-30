package com.mpez.ngbmpez.services;

import com.mpez.ngbmpez.dao.UserDetailDAO;
import com.mpez.ngbmpez.interfaces.UserDetailInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailService {

    @Autowired
    UserDetailDAO userDetailDAO;

    public List<? extends UserDetailInterface> getAllUser() {
        List<? extends UserDetailInterface> userDetailInterfaces = null;
        userDetailInterfaces = userDetailDAO.getAllUser();
        return userDetailInterfaces;

    }

}
