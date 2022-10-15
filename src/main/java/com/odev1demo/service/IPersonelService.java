package com.odev1demo.service;

import com.odev1demo.entity.Personel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonelService {
    Personel getPersonelById(Long id);
    List<Personel> getAllPersonels();
    Personel addPersonelWithId(Personel personel);
    String deletePersonelById(Long id);
    Personel updatePersonelById(Personel personel);
    List<Personel> findPersonelByAd(String isim);
    List<Personel> findPersonelBySoyad(String soyad);
}
