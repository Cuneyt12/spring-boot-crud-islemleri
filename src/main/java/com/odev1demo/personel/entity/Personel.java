package com.odev1demo.personel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.odev1demo.departman.entity.Departman;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Personel")
public class Personel  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private int maas;
}