package com.odev1demo.repository;

import com.odev1demo.entity.Personel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPersonelRepository extends JpaRepository<Personel, Long> {
    List<Personel> findPersonelByAd(String isim);
    List<Personel> findPersonelBySoyad(String soyad);
}
