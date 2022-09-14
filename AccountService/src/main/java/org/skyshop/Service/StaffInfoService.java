package org.skyshop.Service;

import org.skyshop.Entity.StaffInfo;
import org.skyshop.Repository.StaffInfoRepository;
import org.skyshop.dto.StaffInfoDTO;
import org.skyshop.vo.StaffInfoQueryVO;
import org.skyshop.vo.StaffInfoUpdateVO;
import org.skyshop.vo.StaffInfoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class StaffInfoService {

    @Autowired
    private StaffInfoRepository staffInfoRepository;

    public String save(StaffInfoVO vO) {
        StaffInfo bean = new StaffInfo();
        BeanUtils.copyProperties(vO, bean);
        bean = staffInfoRepository.save(bean);
        return bean.getId();
    }

    public void delete(String id) {
        staffInfoRepository.deleteById(id);
    }

    public void update(String id, StaffInfoUpdateVO vO) {
        StaffInfo bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        staffInfoRepository.save(bean);
    }

    public StaffInfoDTO getById(String id) {
        StaffInfo original = requireOne(id);
        return toDTO(original);
    }

    public Page<StaffInfoDTO> query(StaffInfoQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private StaffInfoDTO toDTO(StaffInfo original) {
        StaffInfoDTO bean = new StaffInfoDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private StaffInfo requireOne(String id) {
        return staffInfoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
