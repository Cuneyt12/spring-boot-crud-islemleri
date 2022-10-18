package com.odev1demo.departman.entity;

import com.odev1demo.personel.entity.Personel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Table(name = "departman")
@NoArgsConstructor
public class Departman {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "departmanId")
    private int departmanId;
    private String departmanAdi;
    private String departmanSorumlusu;
}
