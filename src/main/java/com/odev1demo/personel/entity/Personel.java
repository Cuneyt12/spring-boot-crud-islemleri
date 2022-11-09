package com.odev1demo.personel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;

@Entity
@Data
@Table(name = "Personel")
public class Personel {
    @Id
    @Column(name = "id")
    private int id;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private int maas;


}