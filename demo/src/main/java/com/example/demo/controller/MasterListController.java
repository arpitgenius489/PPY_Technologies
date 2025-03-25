package com.example.demo.controller;

import com.example.demo.entity.MasterList;
import com.example.demo.service.MasterListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/master_list")
public class MasterListController {

    @Autowired
    private MasterListService service;

    @PostMapping
    public ResponseEntity<MasterList> createMasterList(@RequestBody MasterList masterList) {
        MasterList savedMasterList = service.saveMasterList(masterList);
        return ResponseEntity.ok(savedMasterList);
    }

    @GetMapping
    public ResponseEntity<List<MasterList>> getAllMasterLists() {
        List<MasterList> masterLists = service.getAllMasterLists();
        return ResponseEntity.ok(masterLists);
    }
}