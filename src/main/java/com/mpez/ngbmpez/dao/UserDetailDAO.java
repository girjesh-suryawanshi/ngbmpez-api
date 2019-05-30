package com.mpez.ngbmpez.dao;

import com.mpez.ngbmpez.interfaces.UserDetailInterface;
import com.mpez.ngbmpez.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailDAO {

    @Autowired
    UserDetailRepository userDetailRepository;

    public List<? extends UserDetailInterface> getAllUser() {
        List<? extends UserDetailInterface> userDetailInterface = null;
        userDetailInterface = userDetailRepository.findAll();
        return userDetailInterface;

    }


}
