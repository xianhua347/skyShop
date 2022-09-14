package org.skyshop.Service;

import org.skyshop.Entity.AuthMsMenu;
import org.skyshop.Repository.AuthMsMenuRepository;
import org.skyshop.dto.AuthMsMenuDTO;
import org.skyshop.vo.AuthMsMenuQueryVO;
import org.skyshop.vo.AuthMsMenuUpdateVO;
import org.skyshop.vo.AuthMsMenuVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AuthMsMenuService {

    @Autowired
    private AuthMsMenuRepository authMsMenuRepository;

    public String save(AuthMsMenuVO vO) {
        AuthMsMenu bean = new AuthMsMenu();
        BeanUtils.copyProperties(vO, bean);
        bean = authMsMenuRepository.save(bean);
        return bean.getId();
    }

    public void delete(String id) {
        authMsMenuRepository.deleteById(id);
    }

    public void update(String id, AuthMsMenuUpdateVO vO) {
        AuthMsMenu bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        authMsMenuRepository.save(bean);
    }

    public AuthMsMenuDTO getById(String id) {
        AuthMsMenu original = requireOne(id);
        return toDTO(original);
    }

    public Page<AuthMsMenuDTO> query(AuthMsMenuQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private AuthMsMenuDTO toDTO(AuthMsMenu original) {
        AuthMsMenuDTO bean = new AuthMsMenuDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private AuthMsMenu requireOne(String id) {
        return authMsMenuRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
