package org.skyshop.Repository;

import org.skyshop.Entity.AuthItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AuthItemRepository extends JpaRepository<AuthItem, String>, JpaSpecificationExecutor<AuthItem> {

}