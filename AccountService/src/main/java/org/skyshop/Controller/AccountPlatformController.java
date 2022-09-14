package org.skyshop.Controller;

import org.skyshop.Service.AccountPlatformService;
import org.skyshop.dto.AccountPlatformDTO;
import org.skyshop.vo.AccountPlatformQueryVO;
import org.skyshop.vo.AccountPlatformUpdateVO;
import org.skyshop.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/accountPlatform")
public class AccountPlatformController {

    @Autowired
    private AccountPlatformService accountPlatformService;

    /*@PostMapping
    public String save(@Valid @RequestBody AccountPlatformVO vO) {
        return accountPlatformService.save(vO);
    }*/

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") String id) {
        accountPlatformService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") String id,
                       @Valid @RequestBody AccountPlatformUpdateVO vO) {
        accountPlatformService.update(id, vO);
    }

    @GetMapping("/{id}")
    public String getById(@Valid @NotNull @PathVariable("id") String id) {
        return accountPlatformService.getById(id).getUid().toString();
    }

    @GetMapping
    public Page<AccountPlatformDTO> query(@Valid AccountPlatformQueryVO vO) {
        return accountPlatformService.query(vO);
    }
}
