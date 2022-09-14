package org.skyshop.Service;

import org.skyshop.Entity.AccountUser;
import org.skyshop.Repository.AccountUserRepository;
import org.skyshop.dto.AccountUserDTO;
import org.skyshop.vo.AccountUserQueryVO;
import org.skyshop.vo.AccountUserUpdateVO;
import org.skyshop.vo.AccountUserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AccountUserService {

    @Autowired
    private AccountUserRepository accountUserRepository;

    public long save(AccountUserVO vO) {
        AccountUser bean = new AccountUser();
        BeanUtils.copyProperties(vO, bean);
        bean = accountUserRepository.save(bean);
        return bean.getId();
    }

    public void delete(Integer id) {
        accountUserRepository.deleteById(id);
    }

    public void update(Integer id, AccountUserUpdateVO vO) {
        AccountUser bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        accountUserRepository.save(bean);
    }

    public AccountUserDTO getById(Integer id) {
        AccountUser original = requireOne(id);
        return toDTO(original);
    }

    public Page<AccountUserDTO> query(AccountUserQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private AccountUserDTO toDTO(AccountUser original) {
        AccountUserDTO bean = new AccountUserDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private AccountUser requireOne(Integer id) {
        return accountUserRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
