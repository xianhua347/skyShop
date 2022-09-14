package org.skyshop.Repository;

import org.skyshop.Entity.AuthRoleStaff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AuthRoleStaffRepository extends JpaRepository<AuthRoleStaff, String>, JpaSpecificationExecutor<AuthRoleStaff> {

}