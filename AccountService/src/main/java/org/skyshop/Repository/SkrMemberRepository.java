package org.skyshop.Repository;

import org.skyshop.Entity.SkrMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SkrMemberRepository extends JpaRepository<SkrMember, String>, JpaSpecificationExecutor<SkrMember> {

}