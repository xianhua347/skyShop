package org.skyshop.Controller;

import org.skyshop.Service.AuthRoleService;
import org.skyshop.dto.AuthRoleDTO;
import org.skyshop.vo.AuthRoleQueryVO;
import org.skyshop.vo.AuthRoleUpdateVO;
import org.skyshop.vo.AuthRoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/authRole")
public class AuthRoleController {

    @Autowired
    private AuthRoleService authRoleService;

    @PostMapping
    public String save(@Valid @RequestBody AuthRoleVO vO) {
        return authRoleService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") String id) {
        authRoleService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") String id,
                       @Valid @RequestBody AuthRoleUpdateVO vO) {
        authRoleService.update(id, vO);
    }

    @GetMapping("/{id}")
    public AuthRoleDTO getById(@Valid @NotNull @PathVariable("id") String id) {
        return authRoleService.getById(id);
    }

    @GetMapping
    public Page<AuthRoleDTO> query(@Valid AuthRoleQueryVO vO) {
        return authRoleService.query(vO);
    }
}
