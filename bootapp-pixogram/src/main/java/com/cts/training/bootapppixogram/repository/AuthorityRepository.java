package com.cts.training.bootapppixogram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.bootapppixogram.entity.Authority;
import com.cts.training.bootapppixogram.repository.custom.AuthorityRepositoryCustom;


public interface AuthorityRepository extends JpaRepository<Authority, Integer> ,AuthorityRepositoryCustom  {

}
