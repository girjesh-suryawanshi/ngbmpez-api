package com.mpez.ngbmpez.controller;

import com.mpez.ngbmpez.interfaces.UserDetailInterface;
import com.mpez.ngbmpez.services.UserDetailService;
import com.mpez.ngbmpez.utility.GlobalResource;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserDetailController {

    private Logger logger = GlobalResource.getLogger(UserDetailController.class);

    @Autowired
    UserDetailService userDetailService;

    @RequestMapping(method = RequestMethod.GET, value = "userdetail", produces = "application/json")
    public ResponseEntity<?> getAllUser() {

        String methodName = "getAllUser()";

        logger.info(methodName, "called");

        ResponseEntity<?> response = null;

        List<? extends UserDetailInterface> userDetailInterfaceList = null;

        userDetailInterfaceList = userDetailService.getAllUser();

        if (userDetailInterfaceList != null) {

            if (userDetailInterfaceList.size() > 0) {
                response = new ResponseEntity(userDetailInterfaceList, HttpStatus.OK);
            } else {
                response = new ResponseEntity("No Content", HttpStatus.NO_CONTENT);
            }
        }

        return response;

    }
}
