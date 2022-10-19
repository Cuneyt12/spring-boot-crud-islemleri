package com.odev1demo.departman.entity;

import com.odev1demo.personel.entity.Personel;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "departman")
public class Departman {

    @Id
    @Column(name = "dep")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "departmanAdi")
    private String departmanAdi;
    @Column(name = "departmanSefi")
    private String departmanSefi;
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinTable(name = "personel_departman",
            joinColumns = @JoinColumn(name = "departman_id"),
                inverseJoinColumns = @JoinColumn(name = "personel_id")
    )
    private List<Personel> personel;
    //@JoinColumn(name = "departman_id", referencedColumnName = "dep")



    //join table
}

