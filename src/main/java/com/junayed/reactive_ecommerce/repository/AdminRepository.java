package com.junayed.reactive_ecommerce.repository;

import com.junayed.reactive_ecommerce.entity.Admin;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AdminRepository {
    Admin admin1 = new Admin(1,"Junayed","j@gmail.com");
    Admin admin2 = new Admin(2, "x", "x@gmail.com");
    private List<Admin>  adminList = List.of(admin1,admin2);

    public List<Admin> findAllAdminList(){
        return adminList;
    }

    public Optional<Admin> findAdminById(long id){
        return adminList.stream().filter(admin -> admin.getId() == id).findFirst();
    }
}
