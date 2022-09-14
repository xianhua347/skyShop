package org.skyshop.Service;

import org.skyshop.Entity.AuthMs;
import org.skyshop.Repository.AuthMsRepository;
import org.skyshop.dto.AuthMsDTO;
import org.skyshop.vo.AuthMsQueryVO;
import org.skyshop.vo.AuthMsUpdateVO;
import org.skyshop.vo.AuthMsVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AuthMsService {

    @Autowired
    private AuthMsRepository authMsRepository;

    public String save(AuthMsVO vO) {
        AuthMs bean = new AuthMs();
        BeanUtils.copyProperties(vO, bean);
        bean = authMsRepository.save(bean);
        return bean.getId();
    }

    public void delete(String id) {
        authMsRepository.deleteById(id);
    }

    public void update(String id, AuthMsUpdateVO vO) {
        AuthMs bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        authMsRepository.save(bean);
    }

    public AuthMsDTO getById(String id) {
        AuthMs original = requireOne(id);
        return toDTO(original);
    }

    public Page<AuthMsDTO> query(AuthMsQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private AuthMsDTO toDTO(AuthMs original) {
        AuthMsDTO bean = new AuthMsDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private AuthMs requireOne(String id) {
        return authMsRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
