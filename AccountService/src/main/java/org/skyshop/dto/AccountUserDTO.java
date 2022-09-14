package org.skyshop.dto;


import java.io.Serializable;

public class AccountUserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 账号id
     */
    private Integer id;


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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
