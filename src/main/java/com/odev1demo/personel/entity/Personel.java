package com.odev1demo.personel.entity;


import com.odev1demo.departman.entity.Departman;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "personel")
@NoArgsConstructor
public class Personel  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personelId")
    private int personelId;
    @Column(name = "ad")
    private String ad;
    @Column(name = "soyad")
    private String soyad;
    private String cinsiyet;
    private int maas;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "departmanId", referencedColumnName = "departmanId")
    private Departman departman;


}