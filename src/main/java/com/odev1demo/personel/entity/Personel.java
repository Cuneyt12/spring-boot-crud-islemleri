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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Departman deparmant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Departman getEmployee() {
        return deparmant;
    }

    public void setEmployee(Departman employee) {
        this.deparmant = employee;
    }

}