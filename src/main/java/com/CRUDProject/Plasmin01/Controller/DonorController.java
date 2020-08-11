package com.CRUDProject.Plasmin01.Controller;

import com.CRUDProject.Plasmin01.Model.Donor;
import com.CRUDProject.Plasmin01.service.DonorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DonorController {

    final
    DonorService donorService;

    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }

    @PostMapping(value = "/donor/add")
    public void addDonor(Donor donor) {

        donorService.addDonor(donor);
    }
}
