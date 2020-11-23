package com.aalhabib01.xyz.BloodDonationBackend.jwt.Util;

import com.aalhabib01.xyz.BloodDonationBackend.jwt.model.Role;
import com.aalhabib01.xyz.BloodDonationBackend.jwt.model.RoleName;
import com.aalhabib01.xyz.BloodDonationBackend.jwt.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@AllArgsConstructor

@Service
public class RoleUtils {
    private RoleRepository roleRepository;

    public Set<Role> getRolesFromStringToRole(Set<String> roles2) {
        Set<Role> roles = new HashSet<>();
        for (String role : roles2) {
            Optional<Role> roleOptional = roleRepository.findByName(RoleName.valueOf(role));
            roleOptional.ifPresent(roles::add);
        }
        return roles;
    }

    public Set<String> getRolesStringFromRole(Set<Role> roles2) {
        Set<String> roles = new HashSet<>();
        for (Role role : roles2) {
            roles.add(role.getName().toString());
        }
        return roles;
    }
}
