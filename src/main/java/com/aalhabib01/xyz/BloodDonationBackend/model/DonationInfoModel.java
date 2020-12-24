package com.aalhabib01.xyz.BloodDonationBackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "DONATION_MODEL")
public class DonationInfoModel {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private String areaDivision;

    private String address;

    private String hospitalName;

    private String bloodGroup;

    private String phoneNo;
}
