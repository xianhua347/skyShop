package org.skyshop.vo;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class AccountUserVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 账号id
     */
    @NotNull(message = "id can not null")
    private Integer id;


    /**
     * 邮箱
     */
    @NotNull(message = "email can not null")
    private String email;


    /**
     * 手机号
     */
    @NotNull(message = "phone can not null")
    private String phone;


    /**
     * 用户名
     */
    @NotNull(message = "username can not null")
    private String username;


    /**
     * 密码
     */
    @NotNull(message = "password can not null")
    private String password;


    /**
     * 创建时间
     */
    @NotNull(message = "createAt can not null")
    private Integer createAt;


    /**
     * 创建ip
     */
    @NotNull(message = "createIpAt can not null")
    private String createIpAt;


    /**
     * 最后一次登录时间
     */
    @NotNull(message = "lastLoginAt can not null")
    private Integer lastLoginAt;


    /**
     * 最后一次登录ip
     */
    @NotNull(message = "lastLoginIpAt can not null")
    private String lastLoginIpAt;


    /**
     * 登录次数
     */
    @NotNull(message = "loginTimes can not null")
    private Integer loginTimes;


    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    @NotNull(message = "status can not null")
    private Integer status;

}
