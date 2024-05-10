package com.birichani_codes.Repository;

import com.birichani_codes.Entities.Security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {
    Role findByname(String name);
}
