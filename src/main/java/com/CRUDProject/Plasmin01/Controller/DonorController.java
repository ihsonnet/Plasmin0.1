package com.CRUDProject.Plasmin01.controller;

import com.CRUDProject.Plasmin01.model.Donor;
import com.CRUDProject.Plasmin01.service.DonorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DonorController {

    final
    DonorService donorService;

    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }

    @PostMapping(value = "/donor/add")
    public void addDonor(@RequestBody Donor donor) {

        donorService.addDonor(donor);
    }

    @GetMapping(value = "/donor/find/all")
    public List<Donor> getAllDonor(){
        return donorService.getAllDonor();
    }

    @GetMapping("/donor/find/{Id}")
    public Optional<Donor> getDonor(@PathVariable long Id){
        return donorService.getDonor(Id);
    }

    @PutMapping(value = "/donor/update")
    public void updateDonor(@RequestBody Donor donor){
        donorService.updateDonor(donor);
    }
}
