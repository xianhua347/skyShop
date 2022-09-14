package org.skyshop.Service;

import org.skyshop.Entity.AuthRoleStaff;
import org.skyshop.Repository.AuthRoleStaffRepository;
import org.skyshop.dto.AuthRoleStaffDTO;
import org.skyshop.vo.AuthRoleStaffQueryVO;
import org.skyshop.vo.AuthRoleStaffUpdateVO;
import org.skyshop.vo.AuthRoleStaffVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AuthRoleStaffService {

    @Autowired
    private AuthRoleStaffRepository authRoleStaffRepository;

    public String save(AuthRoleStaffVO vO) {
        AuthRoleStaff bean = new AuthRoleStaff();
        BeanUtils.copyProperties(vO, bean);
        bean = authRoleStaffRepository.save(bean);
        return bean.getId();
    }

    public void delete(String id) {
        authRoleStaffRepository.deleteById(id);
    }

    public void update(String id, AuthRoleStaffUpdateVO vO) {
        AuthRoleStaff bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        authRoleStaffRepository.save(bean);
    }

    public AuthRoleStaffDTO getById(String id) {
        AuthRoleStaff original = requireOne(id);
        return toDTO(original);
    }

    public Page<AuthRoleStaffDTO> query(AuthRoleStaffQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private AuthRoleStaffDTO toDTO(AuthRoleStaff original) {
        AuthRoleStaffDTO bean = new AuthRoleStaffDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private AuthRoleStaff requireOne(String id) {
        return authRoleStaffRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
