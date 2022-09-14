package org.skyshop.Service;

import org.skyshop.Entity.AuthItem;
import org.skyshop.Repository.AuthItemRepository;
import org.skyshop.dto.AuthItemDTO;
import org.skyshop.vo.AuthItemQueryVO;
import org.skyshop.vo.AuthItemUpdateVO;
import org.skyshop.vo.AuthItemVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AuthItemService {

    @Autowired
    private AuthItemRepository authItemRepository;

    public String save(AuthItemVO vO) {
        AuthItem bean = new AuthItem();
        BeanUtils.copyProperties(vO, bean);
        bean = authItemRepository.save(bean);
        return bean.getId();
    }

    public void delete(String id) {
        authItemRepository.deleteById(id);
    }

    public void update(String id, AuthItemUpdateVO vO) {
        AuthItem bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        authItemRepository.save(bean);
    }

    public AuthItemDTO getById(String id) {
        AuthItem original = requireOne(id);
        return toDTO(original);
    }

    public Page<AuthItemDTO> query(AuthItemQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private AuthItemDTO toDTO(AuthItem original) {
        AuthItemDTO bean = new AuthItemDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private AuthItem requireOne(String id) {
        return authItemRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
