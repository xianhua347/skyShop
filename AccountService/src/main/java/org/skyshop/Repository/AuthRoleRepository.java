package org.skyshop.Repository;

import org.skyshop.Entity.AuthRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AuthRoleRepository extends JpaRepository<AuthRole, String>, JpaSpecificationExecutor<AuthRole> {

}