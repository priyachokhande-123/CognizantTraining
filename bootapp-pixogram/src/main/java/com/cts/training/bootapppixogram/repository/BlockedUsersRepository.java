package com.cts.training.bootapppixogram.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cts.training.bootapppixogram.entity.BlockedUsers;
import com.cts.training.bootapppixogram.repository.custom.BlockedUsersRepositoryCustom;


public interface BlockedUsersRepository extends JpaRepository<BlockedUsers, Integer> ,BlockedUsersRepositoryCustom   {

}
