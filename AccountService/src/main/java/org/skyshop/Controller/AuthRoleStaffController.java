package org.skyshop.Controller;

import org.skyshop.Service.AuthRoleStaffService;
import org.skyshop.dto.AuthRoleStaffDTO;
import org.skyshop.vo.AuthRoleStaffQueryVO;
import org.skyshop.vo.AuthRoleStaffUpdateVO;
import org.skyshop.vo.AuthRoleStaffVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/authRoleStaff")
public class AuthRoleStaffController {

    @Autowired
    private AuthRoleStaffService authRoleStaffService;

    @PostMapping
    public String save(@Valid @RequestBody AuthRoleStaffVO vO) {
        return authRoleStaffService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") String id) {
        authRoleStaffService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") String id,
                       @Valid @RequestBody AuthRoleStaffUpdateVO vO) {
        authRoleStaffService.update(id, vO);
    }

    @GetMapping("/{id}")
    public AuthRoleStaffDTO getById(@Valid @NotNull @PathVariable("id") String id) {
        return authRoleStaffService.getById(id);
    }

    @GetMapping
    public Page<AuthRoleStaffDTO> query(@Valid AuthRoleStaffQueryVO vO) {
        return authRoleStaffService.query(vO);
    }
}
