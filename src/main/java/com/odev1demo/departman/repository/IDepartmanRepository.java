package com.odev1demo.departman.repository;

import com.odev1demo.departman.entity.Departman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmanRepository extends JpaRepository<Departman, Integer> {
    Departman findDepartmanByDepartmanAdi(String departmanAdi);
}
