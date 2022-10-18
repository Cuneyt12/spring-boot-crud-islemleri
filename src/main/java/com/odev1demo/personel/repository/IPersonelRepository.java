package com.odev1demo.personel.repository;

import com.odev1demo.personel.entity.Personel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPersonelRepository extends JpaRepository<Personel, Integer> {
    List<Personel> findPersonelByAd(String isim);
    List<Personel> findPersonelBySoyad(String soyad);
}
