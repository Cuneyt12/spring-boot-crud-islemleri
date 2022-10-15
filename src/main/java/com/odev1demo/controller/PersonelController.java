package com.odev1demo.controller;

import com.odev1demo.entity.Personel;
import com.odev1demo.service.IPersonelService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List; //maven 2.6

@RestController
@RequestMapping("/personel")
public class PersonelController {

    private final IPersonelService iPersonelService;

    public PersonelController(@Qualifier("personelServiceImpl") IPersonelService iPersonelService) {
        this.iPersonelService = iPersonelService;
    }

    @GetMapping("/bilgi/{id}")
    public ResponseEntity<Personel> getInfoById(@PathVariable Long id) {
        return ResponseEntity.ok(iPersonelService.getPersonelById(id));
    }

    @PostMapping("/ekle")
    public ResponseEntity<Personel> addPersonel(@RequestBody Personel personel) {
        return ResponseEntity.ok(iPersonelService.addPersonelWithId(personel));
    }

    @GetMapping("/listele")
    public ResponseEntity<List<Personel>> getAllPersonel() {
        return ResponseEntity.ok(iPersonelService.getAllPersonels());
    }

    @DeleteMapping("/sil/{id}")
    public ResponseEntity<String> deletePersonelById(@PathVariable Long id) {
        return ResponseEntity.ok(iPersonelService.deletePersonelById(id));
    }

    @PutMapping("/guncelle")
    public ResponseEntity<Personel> updatePersonelById(@RequestBody Personel personel) {
        return ResponseEntity.ok(iPersonelService.updatePersonelById(personel));
    }

    @GetMapping("/getInfoByName/{isim}")
    public ResponseEntity<List<Personel>> getPersonelByName(@PathVariable String isim) {
        return ResponseEntity.ok(iPersonelService.findByAd(isim));
    }

    @GetMapping("/getInfoBySurname/{soyad}")
    public ResponseEntity<List<Personel>> getPersonelBySurname(@PathVariable String soyad) {
        return ResponseEntity.ok(iPersonelService.findBySoyad(soyad));
    }
}