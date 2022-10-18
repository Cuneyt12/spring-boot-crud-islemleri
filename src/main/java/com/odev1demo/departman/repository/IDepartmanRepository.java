package com.odev1demo.departman.repository;

import com.odev1demo.departman.entity.Departman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmanRepository extends JpaRepository<Departman, Integer> {
}
