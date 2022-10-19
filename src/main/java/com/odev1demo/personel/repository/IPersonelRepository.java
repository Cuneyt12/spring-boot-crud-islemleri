package com.odev1demo.personel.repository;

import com.odev1demo.personel.entity.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonelRepository extends JpaRepository<Personel, Integer> {
    List<Personel> findPersonelByAd(String isim);
    List<Personel> findPersonelBySoyad(String soyad);
}
