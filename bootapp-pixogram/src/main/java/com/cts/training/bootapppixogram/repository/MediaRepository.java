package com.cts.training.bootapppixogram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.bootapppixogram.entity.Media;
import com.cts.training.bootapppixogram.repository.custom.MediaRepositoryCustom;

@Repository
public interface MediaRepository extends JpaRepository<Media, Integer> ,MediaRepositoryCustom  {

}
