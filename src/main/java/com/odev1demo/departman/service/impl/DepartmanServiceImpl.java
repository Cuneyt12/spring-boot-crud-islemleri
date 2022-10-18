package com.odev1demo.departman.service.impl;

import com.odev1demo.departman.entity.Departman;
import com.odev1demo.departman.repository.IDepartmanRepository;
import com.odev1demo.departman.service.IDepartmanService;
import org.springframework.stereotype.Service;

@Service
public class DepartmanServiceImpl implements IDepartmanService {

    private final IDepartmanRepository iDepartmanRepository;

    public DepartmanServiceImpl(IDepartmanRepository iDepartmanRepository) {
        this.iDepartmanRepository = iDepartmanRepository;
    }
    @Override
    public Departman addDepartman(Departman departman) {
        return iDepartmanRepository.save(departman);

    }


}
