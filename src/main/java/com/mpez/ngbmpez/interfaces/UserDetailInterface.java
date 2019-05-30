package com.mpez.ngbmpez.interfaces;

public interface UserDetailInterface extends BeanInterface {
    public long getId();

    public void setId(long id);

    public String getUserId();

    public void setUserId(String userId);

    public String getUserPassword();

    public void setUserPassword(String userPassword);

    public String getUserFname();

    public void setUserFname(String userFname);

    public String getUserLname();

    public void setUserLname(String userLname);

    public String getAddress();

    public void setAddress(String address);

    public String getRole();

    public void setRole(String role);
}
