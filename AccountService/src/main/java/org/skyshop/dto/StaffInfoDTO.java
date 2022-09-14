package org.skyshop.dto;


import java.io.Serializable;

public class StaffInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 员工id
     */
    private String id;


    /**
     * 账号id
     */
    private String uid;


    /**
     * 员工邮箱
     */
    private String email;


    /**
     * 员工手机号
     */
    private String phone;


    /**
     * 员工姓名
     */
    private String name;


    /**
     * 员工昵称
     */
    private String nickname;


    /**
     * 员工头像(相对路径)
     */
    private String avatar;


    /**
     * 员工性别
     */
    private String gender;


    /**
     * 创建时间
     */
    private Integer createAt;


    /**
     * 更新时间
     */
    private Integer updateAt;

}
