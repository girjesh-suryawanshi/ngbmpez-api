package com.mpez.ngbmpez.beans;

import com.mpez.ngbmpez.interfaces.UserDetailInterface;

import javax.persistence.*;

@Entity(name = "UserDetail")
@Table(name = "user_detail")
public class UserDetail implements UserDetailInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_fname")
    private String userFname;

    @Column(name = "user_lname")
    private String userLname;

    @Column(name = "address")
    private String address;

    @Column(name = "role")
    private String role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserFname() {
        return userFname;
    }

    public void setUserFname(String userFname) {
        this.userFname = userFname;
    }

    public String getUserLname() {
        return userLname;
    }

    public void setUserLname(String userLname) {
        this.userLname = userLname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userFname='" + userFname + '\'' +
                ", userLname='" + userLname + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
