package org.skyshop.vo;


import java.io.Serializable;

public class AuthItemQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 自增id
     */
    private String id;


    /**
     * 系统id
     */
    private String msId;


    /**
     * 页面/接口uri
     */
    private String menuId;


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
