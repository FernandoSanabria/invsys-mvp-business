package com.invsys.mvpbusiness.web.controller;

import com.invsys.mvpbusiness.domain.DomainChain;
import com.invsys.mvpbusiness.domain.service.DomainChainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("chain")
public class ChainController {

    @Autowired
    private DomainChainService domainChainService;

    @GetMapping("/all/{country}")
    public ResponseEntity<List<DomainChain>> getAll(@PathVariable("country") String country) {
        return new ResponseEntity<>(domainChainService.getAllByCountry(country), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<DomainChain> save(@RequestBody DomainChain request) {
        return new ResponseEntity<>(domainChainService.save(request),HttpStatus.CREATED);
    }
}
