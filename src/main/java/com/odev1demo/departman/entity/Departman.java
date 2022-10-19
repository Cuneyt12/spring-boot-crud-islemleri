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
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "departman")
    private List<Personel> emails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Personel> getEmails() {
        return emails;
    }

    public void setEmails(List<Personel> emails) {
        this.emails = emails;
    }
}
