package org.skyshop.Repository;

import org.skyshop.Entity.StaffInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StaffInfoRepository extends JpaRepository<StaffInfo, String>, JpaSpecificationExecutor<StaffInfo> {

}