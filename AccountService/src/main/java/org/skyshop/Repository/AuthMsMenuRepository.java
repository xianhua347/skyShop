package org.skyshop.Repository;

import org.skyshop.Entity.AuthMsMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AuthMsMenuRepository extends JpaRepository<AuthMsMenu, String>, JpaSpecificationExecutor<AuthMsMenu> {

}