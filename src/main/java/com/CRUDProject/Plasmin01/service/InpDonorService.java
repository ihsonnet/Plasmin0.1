package com.CRUDProject.Plasmin01.service;

import com.CRUDProject.Plasmin01.Model.Donor;
import com.CRUDProject.Plasmin01.repository.DonorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class InpDonorService implements DonorService {

    final
    DonorRepository donorRepository;

    public InpDonorService(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    @Override
    public void addDonor(Donor donor) {
        donorRepository.save(donor);

    }

    @Override
    public void updateDonor(Donor donor) {

    }

    @Override
    public Donor getDonor(long Id) {
        return null;
    }

    @Override
    public List<Donor> getAllDonor() {
        return null;
    }

    @Override
    public Donor deleteDonor(long Id) {
        return null;
    }
}
