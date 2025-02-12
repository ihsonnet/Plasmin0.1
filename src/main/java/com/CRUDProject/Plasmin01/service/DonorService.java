package com.CRUDProject.Plasmin01.service;

import com.CRUDProject.Plasmin01.model.Donor;

import java.util.List;
import java.util.Optional;

public interface DonorService {
    void addDonor(Donor donor);
    void updateDonor(Donor donor);
    Optional<Donor> getDonor(long Id);
    List<Donor> getAllDonor();
    void deleteDonor(long Id);
}
