package org.skyshop.Repository;

import org.skyshop.Entity.AccountPlatform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccountPlatformRepository extends JpaRepository<AccountPlatform, String>, JpaSpecificationExecutor<AccountPlatform> {

}