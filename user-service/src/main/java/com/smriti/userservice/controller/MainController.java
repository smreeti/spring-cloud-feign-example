package com.smriti.userservice.controller;

import com.smriti.userservice.repository.BillionaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

@RestController
@RequestMapping("/billionaire")
public class MainController {

    @Autowired
    private BillionaireRepository billRepo;

    @GetMapping("/list")
    public ResponseEntity listBillionaires() {
        return ResponseEntity.ok(billRepo.findAll());
    }

    @PostMapping(value = "/upload", consumes = MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity uploadFiles(@RequestPart(value = "file") MultipartFile[] file) {
        System.out.println("****hello ****");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/endpoint")
    Object get(@RequestParam(value = "id", required = false) List<String> id) {
        return id;
    }

}
