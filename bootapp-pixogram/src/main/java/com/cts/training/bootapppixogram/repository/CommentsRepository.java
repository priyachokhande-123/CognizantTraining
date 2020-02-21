package com.cts.training.bootapppixogram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.bootapppixogram.entity.Comments;
import com.cts.training.bootapppixogram.repository.custom.CommentsRepositoryCustom;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Integer> ,CommentsRepositoryCustom  {

}
