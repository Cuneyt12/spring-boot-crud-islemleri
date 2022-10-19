package com.odev1demo.departman.service;

import com.odev1demo.departman.entity.Departman;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDepartmanService {
    Departman addDepartman(Departman departman);
    List<Departman> getDepartman();
}
