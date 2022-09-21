package org.skyshop.Controller;


import org.skyshop.Service.AccountUserService;
import org.skyshop.dto.AccountUserDTO;
import org.skyshop.vo.AccountUserQueryVO;
import org.skyshop.vo.AccountUserUpdateVO;
import org.skyshop.vo.AccountUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import result.Result;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/accountUser")
public class AccountUserController {

    @Autowired
    private AccountUserService accountUserService;

    @PostMapping
    public Long save(@Valid @RequestBody AccountUserVO vO) {
        return accountUserService.save(vO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        accountUserService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Integer id,
                       @Valid @RequestBody AccountUserUpdateVO vO) {
        accountUserService.update(id, vO);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable("id") Integer id) {
        final AccountUserDTO userDTO = accountUserService.getById(id);
        return Result.success(userDTO);
    }

    @GetMapping
    public Page<AccountUserDTO> query(@Valid AccountUserQueryVO vO) {
        return accountUserService.query(vO);
    }

}
