package com.cts.training.bootapppixogram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.bootapppixogram.entity.Follow;
import com.cts.training.bootapppixogram.repository.custom.FollowRepositoryCustom;

@Repository
public interface FollowRepository extends JpaRepository<Follow, Integer> ,FollowRepositoryCustom  {

}
