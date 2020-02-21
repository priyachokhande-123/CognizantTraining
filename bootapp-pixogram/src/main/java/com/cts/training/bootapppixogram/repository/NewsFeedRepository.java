package com.cts.training.bootapppixogram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.bootapppixogram.entity.NewsFeed;
import com.cts.training.bootapppixogram.repository.custom.NewsFeedRepositoryCustom;

@Repository
public interface NewsFeedRepository extends JpaRepository<NewsFeed, Integer> ,NewsFeedRepositoryCustom   {

}
