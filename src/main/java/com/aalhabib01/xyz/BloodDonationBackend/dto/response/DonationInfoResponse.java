package com.aalhabib01.xyz.BloodDonationBackend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DonationInfoResponse {
    private String division;

    private String name;

    private String description;

    private String address;

    private String hospitalName;

    private String bloodGroup;

    private String phoneNo;
}
