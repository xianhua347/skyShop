package org.skyshop.dto;


import java.io.Serializable;

public class AuthRoleStaffDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    private String id;


    /**
     * 员工id
     */
    private String staffId;


    /**
     * 角色集合 多个值,号隔开
     */
    private String roleSet;


    /**
     * 创建时间
     */
    private Integer createAt;


    /**
     * 创建人staff_id
     */
    private Integer createBy;


    /**
     * 更新时间
     */
    private Integer updateAt;


    /**
     * 修改人staff_id
     */
    private Integer updateBy;


    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    private Integer status;

}
