package com.odev1demo.personel.service.impl;

import com.odev1demo.personel.repository.IPersonelRepository;
import com.odev1demo.personel.entity.Personel;
import com.odev1demo.personel.service.IPersonelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonelServiceImpl implements IPersonelService {

    final IPersonelRepository iPersonelRepository;

    public PersonelServiceImpl(IPersonelRepository iPersonelRepository){
        this.iPersonelRepository = iPersonelRepository;
    }

    @Override
    public Personel getPersonelById(Integer id) {
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
    public String deletePersonelById(Integer id) {
         iPersonelRepository.deleteById(id);
         return "Silindi";
    }

    @Override
    public Personel updatePersonelById(Personel personel) {
       return iPersonelRepository.save(personel);
    }

    @Override
    public List<Personel> findPersonelByAd(String isim) {
        return iPersonelRepository.findPersonelByAd(isim);
    }

    @Override
    public List<Personel> findPersonelBySoyad(String soyad) {
        return iPersonelRepository.findPersonelBySoyad(soyad);
    }
}