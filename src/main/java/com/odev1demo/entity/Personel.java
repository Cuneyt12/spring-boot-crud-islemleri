package com.odev1demo.entity;


import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Table(name = "demo")
public class Personel  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ad")
    private String ad;
    @Column(name = "soyad")
    private String soyad;
    private String cinsiyet;
    private int maas;

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }
}
