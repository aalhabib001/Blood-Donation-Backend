package com.aalhabib01.xyz.BloodDonationBackend.service;

import com.aalhabib01.xyz.BloodDonationBackend.dto.request.DonationInfoRequest;
import com.aalhabib01.xyz.BloodDonationBackend.jwt.dto.response.UserResponse;
import com.aalhabib01.xyz.BloodDonationBackend.jwt.services.SignUpAndSignInService;
import com.aalhabib01.xyz.BloodDonationBackend.model.DonationInfoModel;
import com.aalhabib01.xyz.BloodDonationBackend.repository.DonationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DonationService {

    private final DonationRepository donationRepository;
    private final SignUpAndSignInService signUpAndSignInService;

    public String addDonationRequest(DonationInfoRequest donationInfoRequest) {
        UserResponse user = signUpAndSignInService.getLoggedAuthUser();

        DonationInfoModel donationInfoModel = new DonationInfoModel();
        donationInfoModel.setAddress(donationInfoRequest.getAddress());
        donationInfoModel.setBloodGroup(donationInfoRequest.getBloodGroup());
        donationInfoModel.setAreaDivision(donationInfoRequest.getDivision());
        donationInfoModel.setDescription(donationInfoRequest.getDescription());
        donationInfoModel.setHospitalName(donationInfoRequest.getHospitalName());
        donationInfoModel.setPhoneNo(donationInfoRequest.getPhoneNo());
        donationInfoModel.setName(user.getFirstName() + " "+user.getLastName());

        donationRepository.save(donationInfoModel);

        return "Data Saved";
    }

    public List<DonationInfoModel> getDonationInfo() {
        List<DonationInfoModel> donationInfoModelList = donationRepository.findAll();

        return donationInfoModelList;
    }
}
