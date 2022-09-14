package org.skyshop.Controller;

import org.skyshop.Service.AuthMsService;
import org.skyshop.dto.AuthMsDTO;
import org.skyshop.vo.AuthMsQueryVO;
import org.skyshop.vo.AuthMsUpdateVO;
import org.skyshop.vo.AuthMsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/authMs")
public class AuthMsController {

    @Autowired
    private AuthMsService authMsService;

    @PostMapping
    public String save(@Valid @RequestBody AuthMsVO vO) {
        return authMsService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") String id) {
        authMsService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") String id,
                       @Valid @RequestBody AuthMsUpdateVO vO) {
        authMsService.update(id, vO);
    }

    @GetMapping("/{id}")
    public AuthMsDTO getById(@Valid @NotNull @PathVariable("id") String id) {
        return authMsService.getById(id);
    }

    @GetMapping
    public Page<AuthMsDTO> query(@Valid AuthMsQueryVO vO) {
        return authMsService.query(vO);
    }
}
