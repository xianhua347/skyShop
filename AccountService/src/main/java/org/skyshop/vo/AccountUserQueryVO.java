package org.skyshop.vo;


import java.io.Serializable;

public class AccountUserQueryVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 账号id
     */
    private String id;


    /**
     * 邮箱
     */
    private String email;


    /**
     * 手机号
     */
    private String phone;


    /**
     * 用户名
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 创建时间
     */
    private Integer createAt;


    /**
     * 创建ip
     */
    private String createIpAt;


    /**
     * 最后一次登录时间
     */
    private Integer lastLoginAt;


    /**
     * 最后一次登录ip
     */
    private String lastLoginIpAt;


    /**
     * 登录次数
     */
    private Integer loginTimes;


    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    private Integer status;

}
