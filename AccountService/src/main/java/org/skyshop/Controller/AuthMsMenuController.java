package org.skyshop.Controller;

import org.skyshop.Service.AuthMsMenuService;
import org.skyshop.dto.AuthMsMenuDTO;
import org.skyshop.vo.AuthMsMenuQueryVO;
import org.skyshop.vo.AuthMsMenuUpdateVO;
import org.skyshop.vo.AuthMsMenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/authMsMenu")
public class AuthMsMenuController {

    @Autowired
    private AuthMsMenuService authMsMenuService;

    @PostMapping
    public String save(@Valid @RequestBody AuthMsMenuVO vO) {
        return authMsMenuService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") String id) {
        authMsMenuService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") String id,
                       @Valid @RequestBody AuthMsMenuUpdateVO vO) {
        authMsMenuService.update(id, vO);
    }

    @GetMapping("/{id}")
    public AuthMsMenuDTO getById(@Valid @NotNull @PathVariable("id") String id) {
        return authMsMenuService.getById(id);
    }

    @GetMapping
    public Page<AuthMsMenuDTO> query(@Valid AuthMsMenuQueryVO vO) {
        return authMsMenuService.query(vO);
    }
}
