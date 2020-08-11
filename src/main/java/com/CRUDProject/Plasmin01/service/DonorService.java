package com.CRUDProject.Plasmin01.service;

import com.CRUDProject.Plasmin01.Model.Donor;

import java.util.List;

public interface DonorService {
    void addDonor(Donor donor);
    void updateDonor(Donor donor);
    Donor getDonor(long Id);
    List<Donor> getAllDonor();
    Donor deleteDonor(long Id);
}
