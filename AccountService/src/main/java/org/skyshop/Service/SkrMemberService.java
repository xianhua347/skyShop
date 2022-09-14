package org.skyshop.Service;

import org.skyshop.Entity.SkrMember;
import org.skyshop.Repository.SkrMemberRepository;
import org.skyshop.dto.SkrMemberDTO;
import org.skyshop.vo.SkrMemberQueryVO;
import org.skyshop.vo.SkrMemberUpdateVO;
import org.skyshop.vo.SkrMemberVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class SkrMemberService {

    @Autowired
    private SkrMemberRepository skrMemberRepository;

    public String save(SkrMemberVO vO) {
        SkrMember bean = new SkrMember();
        BeanUtils.copyProperties(vO, bean);
        bean = skrMemberRepository.save(bean);
        return bean.getId();
    }

    public void delete(String id) {
        skrMemberRepository.deleteById(id);
    }

    public void update(String id, SkrMemberUpdateVO vO) {
        SkrMember bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        skrMemberRepository.save(bean);
    }

    public SkrMemberDTO getById(String id) {
        SkrMember original = requireOne(id);
        return toDTO(original);
    }

    public Page<SkrMemberDTO> query(SkrMemberQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private SkrMemberDTO toDTO(SkrMember original) {
        SkrMemberDTO bean = new SkrMemberDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private SkrMember requireOne(String id) {
        return skrMemberRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
