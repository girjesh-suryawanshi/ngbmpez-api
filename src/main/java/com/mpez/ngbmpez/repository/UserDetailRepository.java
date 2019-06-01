package com.mpez.ngbmpez.repository;

import com.mpez.ngbmpez.beans.UserDetail;
import com.mpez.ngbmpez.interfaces.UserDetailInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail,Long> {

    public UserDetailInterface save(UserDetailInterface userDetailInterface);
    UserDetailInterface findByUserId(String userId);

}
