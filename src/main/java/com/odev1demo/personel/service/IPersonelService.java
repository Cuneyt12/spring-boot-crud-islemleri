package com.odev1demo.personel.service;

import com.odev1demo.personel.entity.Personel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonelService {
    Personel getPersonelById(Integer id);
    List<Personel> getAllPersonels();
    Personel addPersonelWithId(Personel personel);
    String deletePersonelById(Integer id);
    Personel updatePersonelById(Personel personel);
    List<Personel> findPersonelByAd(String isim);
    List<Personel> findPersonelBySoyad(String soyad);
}
