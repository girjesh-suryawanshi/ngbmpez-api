package com.mpez.ngbmpez.repository;

import com.mpez.ngbmpez.beans.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail,Long> {


}
