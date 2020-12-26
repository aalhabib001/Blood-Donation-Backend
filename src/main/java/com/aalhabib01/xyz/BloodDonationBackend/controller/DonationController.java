package com.aalhabib01.xyz.BloodDonationBackend.controller;

import com.aalhabib01.xyz.BloodDonationBackend.dto.request.DonationInfoRequest;
import com.aalhabib01.xyz.BloodDonationBackend.dto.response.DonorResponse;
import com.aalhabib01.xyz.BloodDonationBackend.model.DonationInfoModel;
import com.aalhabib01.xyz.BloodDonationBackend.service.DonationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/donation/list")
public class DonationController {
    private final DonationService donationService;

    @PostMapping("/")
    public String addDonationRequest(@RequestBody DonationInfoRequest donationInfoRequest){
        return donationService.addDonationRequest(donationInfoRequest);
    }

    @GetMapping("/")
    public List<DonationInfoModel> getDonationRequestInfo(){
        return donationService.getDonationInfo();
    }

    @GetMapping("/donors/")
    public List<DonorResponse> getDonors(){
        return donationService.getDonors();
    }

}
