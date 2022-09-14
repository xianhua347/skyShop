package org.skyshop.Controller;

import org.skyshop.Service.StaffInfoService;
import org.skyshop.dto.StaffInfoDTO;
import org.skyshop.vo.StaffInfoQueryVO;
import org.skyshop.vo.StaffInfoUpdateVO;
import org.skyshop.vo.StaffInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/staffInfo")
public class StaffInfoController {

    @Autowired
    private StaffInfoService staffInfoService;

    @PostMapping
    public String save(@Valid @RequestBody StaffInfoVO vO) {
        return staffInfoService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") String id) {
        staffInfoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") String id,
                       @Valid @RequestBody StaffInfoUpdateVO vO) {
        staffInfoService.update(id, vO);
    }

    @GetMapping("/{id}")
    public StaffInfoDTO getById(@Valid @NotNull @PathVariable("id") String id) {
        return staffInfoService.getById(id);
    }

    @GetMapping
    public Page<StaffInfoDTO> query(@Valid StaffInfoQueryVO vO) {
        return staffInfoService.query(vO);
    }
}
