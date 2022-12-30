package com.accolite.tfr.repository;

import com.accolite.tfr.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProjectRepository extends JpaRepository<Project,Integer> {

    @Query(value="SELECT * FROM project where id=?1",nativeQuery=true)
    Project findProjectById(int p_id);
}
