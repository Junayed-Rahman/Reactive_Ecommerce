package com.junayed.reactive_ecommerce.service;

import com.junayed.reactive_ecommerce.dto.AdminDto;
import com.junayed.reactive_ecommerce.entity.Admin;
import com.junayed.reactive_ecommerce.repository.AdminRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminService {

    private final AdminRepository adminRepository;

    private final ModelMapper modelMapper;

    public Admin mapToAdmin(AdminDto adminDto){
        Admin admin = modelMapper.map(adminDto, Admin.class);
        return admin;
    }


}
