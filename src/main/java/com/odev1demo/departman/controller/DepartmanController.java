package com.odev1demo.departman.controller;

import com.odev1demo.departman.entity.AddDepartman;
import com.odev1demo.departman.entity.Departman;
import com.odev1demo.departman.service.IDepartmanService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departman")

public class DepartmanController {

    private final IDepartmanService iDepartmanService;

    public DepartmanController(@Qualifier("departmanServiceImpl") IDepartmanService iDepartmanService) {
        this.iDepartmanService = iDepartmanService;
    }

    @PostMapping("/ekle")
    public ResponseEntity<Departman> addDepartman(@RequestBody Departman departman){
        return ResponseEntity.ok(iDepartmanService.addDepartman(departman));
    }

    @GetMapping("/listele")
    public ResponseEntity<List<Departman>> getDepartman(){
        return ResponseEntity.ok(iDepartmanService.getDepartman());
    }
//json içine departman adı ve personel tc no yaz - departman_personel tablosuna ekle
    @GetMapping("/getById/{id}")
    public ResponseEntity<Departman> getDepartman(@PathVariable Integer id){
        return ResponseEntity.ok(iDepartmanService.getDepartmanById(id));
    }

    @PostMapping("/departmanEkle")
    public ResponseEntity<String> assingDepartman(@RequestBody AddDepartman addDepartman){
        return ResponseEntity.ok(iDepartmanService.assingDepartman(addDepartman));
    }

}
