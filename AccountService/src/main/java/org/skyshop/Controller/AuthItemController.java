package org.skyshop.Controller;

import org.skyshop.Service.AuthItemService;
import org.skyshop.dto.AuthItemDTO;
import org.skyshop.vo.AuthItemQueryVO;
import org.skyshop.vo.AuthItemUpdateVO;
import org.skyshop.vo.AuthItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/authItem")
public class AuthItemController {

    @Autowired
    private AuthItemService authItemService;

    @PostMapping
    public String save(@Valid @RequestBody AuthItemVO vO) {
        return authItemService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") String id) {
        authItemService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") String id,
                       @Valid @RequestBody AuthItemUpdateVO vO) {
        authItemService.update(id, vO);
    }

    @GetMapping("/{id}")
    public AuthItemDTO getById(@Valid @NotNull @PathVariable("id") String id) {
        return authItemService.getById(id);
    }

    @GetMapping
    public Page<AuthItemDTO> query(@Valid AuthItemQueryVO vO) {
        return authItemService.query(vO);
    }
}
