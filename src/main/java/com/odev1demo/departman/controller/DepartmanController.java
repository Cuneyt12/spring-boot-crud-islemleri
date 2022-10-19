package com.odev1demo.departman.controller;

import com.odev1demo.departman.entity.Departman;
import com.odev1demo.departman.repository.IDepartmanRepository;
import com.odev1demo.departman.service.IDepartmanService;
import com.odev1demo.departman.service.impl.DepartmanServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
