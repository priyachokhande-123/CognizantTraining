package com.cts.training.bootapppixogram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.bootapppixogram.entity.Action;
import com.cts.training.bootapppixogram.repository.custom.ActionRepositoryCustom;



public interface ActionRepository extends JpaRepository<Action, Integer>,ActionRepositoryCustom   {

}
