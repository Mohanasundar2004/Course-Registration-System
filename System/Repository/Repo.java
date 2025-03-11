package com.example.Course.Registration.System.Repository;

import com.example.Course.Registration.System.Model.Coursesystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Coursesystem,String> {
}
