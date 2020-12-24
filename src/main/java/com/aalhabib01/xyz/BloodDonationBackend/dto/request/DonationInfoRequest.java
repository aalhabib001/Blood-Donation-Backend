package com.aalhabib01.xyz.BloodDonationBackend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DonationInfoRequest {
    private String division;

    private String description;

    private String address;

    private String hospitalName;

    private String bloodGroup;

    private String phoneNo;
}
