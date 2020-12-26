package com.aalhabib01.xyz.BloodDonationBackend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DonorResponse {
    String name;

    String phone;

    String location;

    String bloodGroup;

}
