package org.skyshop.Service;

import org.skyshop.Entity.AccountPlatform;
import org.skyshop.Repository.AccountPlatformRepository;
import org.skyshop.dto.AccountPlatformDTO;
import org.skyshop.vo.AccountPlatformQueryVO;
import org.skyshop.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AccountPlatformService {

    @Autowired
    private AccountPlatformRepository accountPlatformRepository;

    public String save(AccountPlatformVO vO) {
        AccountPlatform bean = new AccountPlatform();
        BeanUtils.copyProperties(vO, bean);
        bean = accountPlatformRepository.save(bean);
        return bean.getId();
    }

    public void delete(String id) {
        accountPlatformRepository.deleteById(id);
    }

    public void update(String id, AccountPlatformUpdateVO vO) {
        AccountPlatform bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        accountPlatformRepository.save(bean);
    }

    public AccountPlatformDTO getById(String id) {
        AccountPlatform original = requireOne(id);
        return toDTO(original);
    }

    public Page<AccountPlatformDTO> query(AccountPlatformQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private AccountPlatformDTO toDTO(AccountPlatform original) {
        AccountPlatformDTO bean = new AccountPlatformDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private AccountPlatform requireOne(String id) {
        return accountPlatformRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
