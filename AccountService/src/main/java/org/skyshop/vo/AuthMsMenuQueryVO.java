package org.skyshop.vo;


import java.io.Serializable;

public class AuthMsMenuQueryVO implements Serializable {
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
     * 父菜单id
     */
    private String parentId;


    /**
     * 菜单名称
     */
    private String menuName;


    /**
     * 菜描述
     */
    private String menuDesc;


    /**
     * 菜单uri
     */
    private String menuUri;


    /**
     * 创建时间
     */
    private Integer createAt;


    /**
     * 是否展示菜单
     */
    private Boolean show;


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
