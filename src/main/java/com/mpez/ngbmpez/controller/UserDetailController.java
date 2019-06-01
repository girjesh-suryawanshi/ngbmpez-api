package com.mpez.ngbmpez.controller;

import com.mpez.ngbmpez.beans.UserDetail;
import com.mpez.ngbmpez.interfaces.UserDetailInterface;
import com.mpez.ngbmpez.services.UserDetailService;
import com.mpez.ngbmpez.utility.GlobalResource;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/user")


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

    @RequestMapping(method = RequestMethod.POST, value = "postUserDetail", consumes = "application/json")
    public ResponseEntity<?> postUserDetail(@RequestBody UserDetail userDetail) {

        String methodName = "postUserDetail()";
        logger.info(methodName, "called");
        ResponseEntity<?> response = null;
        UserDetailInterface userDetailInterface = null;
        if (userDetail != null) {
            userDetailInterface = userDetailService.postUserDetail(userDetail);
        }
        return new ResponseEntity<>(userDetailInterface, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login", consumes = "application/json")
    public ResponseEntity<?> userLogin(@RequestBody UserDetail userDetail) {
        String methodName = "userLogin()";
        logger.info(methodName + "called");
        ResponseEntity<?> response = null;
        UserDetailInterface userDetailInterface = null;
        logger.info("Recieved from front end", userDetail);

        if (userDetail != null) {
            userDetailInterface = userDetailService.getUserByUserId(userDetail.getUserId());
        }
        if (userDetailInterface != null) {

            if (!userDetailInterface.getUserPassword().equals(userDetail.getUserPassword())) {
                response = new ResponseEntity<>("Authentication failed", HttpStatus.UNAUTHORIZED);
            } else {
                response = new ResponseEntity<>(userDetailInterface, HttpStatus.OK);
            }

        }

        return response;
    }
}
