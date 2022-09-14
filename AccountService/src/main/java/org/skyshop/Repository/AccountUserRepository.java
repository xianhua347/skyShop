package org.skyshop.Repository;

import org.skyshop.Entity.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccountUserRepository extends JpaRepository<AccountUser, Integer>, JpaSpecificationExecutor<AccountUser> {

}