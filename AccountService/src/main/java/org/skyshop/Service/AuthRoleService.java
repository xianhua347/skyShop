package org.skyshop.Service;

import org.skyshop.Entity.AuthRole;
import org.skyshop.Repository.AuthRoleRepository;
import org.skyshop.dto.AuthRoleDTO;
import org.skyshop.vo.AuthRoleQueryVO;
import org.skyshop.vo.AuthRoleUpdateVO;
import org.skyshop.vo.AuthRoleVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AuthRoleService {

    @Autowired
    private AuthRoleRepository authRoleRepository;

    public String save(AuthRoleVO vO) {
        AuthRole bean = new AuthRole();
        BeanUtils.copyProperties(vO, bean);
        bean = authRoleRepository.save(bean);
        return bean.getId();
    }

    public void delete(String id) {
        authRoleRepository.deleteById(id);
    }

    public void update(String id, AuthRoleUpdateVO vO) {
        AuthRole bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        authRoleRepository.save(bean);
    }

    public AuthRoleDTO getById(String id) {
        AuthRole original = requireOne(id);
        return toDTO(original);
    }

    public Page<AuthRoleDTO> query(AuthRoleQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private AuthRoleDTO toDTO(AuthRole original) {
        AuthRoleDTO bean = new AuthRoleDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private AuthRole requireOne(String id) {
        return authRoleRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
