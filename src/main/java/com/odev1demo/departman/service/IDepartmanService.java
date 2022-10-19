package com.odev1demo.departman.service;

import com.odev1demo.departman.entity.Departman;
import org.springframework.stereotype.Service;

@Service
public interface IDepartmanService {
    Departman addDepartman(Departman departman);
}
