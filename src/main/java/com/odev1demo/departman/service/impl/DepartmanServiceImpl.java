package com.odev1demo.departman.service.impl;

import com.odev1demo.departman.entity.AddDepartman;
import com.odev1demo.departman.entity.Departman;
import com.odev1demo.departman.repository.IDepartmanRepository;
import com.odev1demo.departman.service.IDepartmanService;
import com.odev1demo.personel.entity.Personel;
import com.odev1demo.personel.repository.IPersonelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmanServiceImpl implements IDepartmanService {
    private final IDepartmanRepository iDepartmanRepository;
    private final IPersonelRepository iPersonelRepository;

    public DepartmanServiceImpl(IDepartmanRepository iDepartmanRepository, IPersonelRepository iPersonelRepository) {
        this.iDepartmanRepository = iDepartmanRepository;
        this.iPersonelRepository = iPersonelRepository;
    }

    @Override
    public Departman addDepartman(Departman departman) {
        return iDepartmanRepository.save(departman);
    }

    @Override
    public List<Departman> getDepartman() {
        return iDepartmanRepository.findAll();
    }

    @Override
    public Departman getDepartmanById(Integer id) {
        return iDepartmanRepository.findAll().get(id - 1);
    }

    @Override
    public String assingDepartman(AddDepartman addDepartman) {
        Departman dep = iDepartmanRepository.findDepartmanByDepartmanAdi(addDepartman.getDepartmanAdi());

       // System.out.println(iPersonelRepository.findPersonelById(addDepartman.getPersonelId()));

        dep.getPersonel().add(iPersonelRepository.findPersonelById(addDepartman.getPersonelId()));

        //System.out.println(dep.getPersonel());

        iDepartmanRepository.save(dep);
        return "Kayıt başarılı";
    }
}