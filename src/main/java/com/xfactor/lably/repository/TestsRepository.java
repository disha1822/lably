package com.xfactor.lably.repository;

import com.xfactor.lably.entity.Tests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestsRepository extends JpaRepository<Tests, Long>{

    Tests findByName(String name);
}