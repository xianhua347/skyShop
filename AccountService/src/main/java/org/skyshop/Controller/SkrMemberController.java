package org.skyshop.Controller;

import org.skyshop.Service.SkrMemberService;
import org.skyshop.dto.SkrMemberDTO;
import org.skyshop.vo.SkrMemberQueryVO;
import org.skyshop.vo.SkrMemberUpdateVO;
import org.skyshop.vo.SkrMemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/skrMember")
public class SkrMemberController {

    @Autowired
    private SkrMemberService skrMemberService;

    @PostMapping
    public String save(@Valid @RequestBody SkrMemberVO vO) {
        return skrMemberService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") String id) {
        skrMemberService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") String id,
                       @Valid @RequestBody SkrMemberUpdateVO vO) {
        skrMemberService.update(id, vO);
    }

    @GetMapping("/{id}")
    public SkrMemberDTO getById(@Valid @NotNull @PathVariable("id") String id) {
        return skrMemberService.getById(id);
    }

    @GetMapping
    public Page<SkrMemberDTO> query(@Valid SkrMemberQueryVO vO) {
        return skrMemberService.query(vO);
    }
}
