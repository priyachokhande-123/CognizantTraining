package com.cts.training.bootapppixogram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.bootapppixogram.entity.UserDetails;
import com.cts.training.bootapppixogram.repository.custom.UserDetailsRepositoryCustom;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> ,UserDetailsRepositoryCustom   {

}
