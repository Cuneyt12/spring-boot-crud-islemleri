package com.odev1demo.service.impl;

import com.odev1demo.repository.IPersonelRepository;
import com.odev1demo.entity.Personel;
import com.odev1demo.service.IPersonelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonelServiceImpl implements IPersonelService {

    final IPersonelRepository iPersonelRepository;

    public PersonelServiceImpl(IPersonelRepository iPersonelRepository){
        this.iPersonelRepository = iPersonelRepository;
    }

    @Override
    public Personel getPersonelById(Long id) {
        return  iPersonelRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Personel> getAllPersonels() {
        return iPersonelRepository.findAll();
    }

    @Override
    public Personel addPersonelWithId(Personel personel) {
        return iPersonelRepository.save(personel);
    }

    @Override
    public String deletePersonelById(Long id) {
         iPersonelRepository.deleteById(id);
         return "Silindi";
    }

    @Override
    public Personel updatePersonelById(Personel personel) {
       return iPersonelRepository.save(personel);
    }

    @Override
    public List<Personel> findByAd(String isim) {
        return iPersonelRepository.findByAd(isim);
    }

    @Override
    public List<Personel> findBySoyad(String soyad) {
        return iPersonelRepository.findBySoyad(soyad);
    }
}