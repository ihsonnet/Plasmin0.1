package com.CRUDProject.Plasmin01.service;
import com.CRUDProject.Plasmin01.model.Donor;
import com.CRUDProject.Plasmin01.repository.DonorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class ImpDonorService implements DonorService {

    final
    DonorRepository donorRepository;

    public ImpDonorService(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    @Override
    public void addDonor(Donor donor) {
        donorRepository.save(donor);

    }

    @Override
    public void updateDonor(Donor donor) {
    donorRepository.save(donor);
    }

    @Override
    public Optional<Donor> getDonor(long Id) {
        return donorRepository.findById(Id);
    }

    @Override
    public List<Donor> getAllDonor() {

        List<Donor> donors = new ArrayList<>();
        donorRepository.findAll().forEach(donors::add);
        return donors;

    }

    @Override
    public void deleteDonor(long Id) {
        donorRepository.deleteById(Id);
    }
}
