package org.skyshop.Repository;

import org.skyshop.Entity.AuthMs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AuthMsRepository extends JpaRepository<AuthMs, String>, JpaSpecificationExecutor<AuthMs> {

}