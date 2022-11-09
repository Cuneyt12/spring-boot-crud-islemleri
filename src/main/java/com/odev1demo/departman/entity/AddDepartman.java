package com.odev1demo.departman.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
public class AddDepartman {
    private String departmanAdi;
    private int personelId;
}
