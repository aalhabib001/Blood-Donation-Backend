package com.aalhabib01.xyz.BloodDonationBackend.repository;

import com.aalhabib01.xyz.BloodDonationBackend.model.DonationInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<DonationInfoModel, Long> {
}
