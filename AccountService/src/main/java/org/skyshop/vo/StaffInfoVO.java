package org.skyshop.vo;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class StaffInfoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 员工id
     */
    @NotNull(message = "id can not null")
    private String id;


    /**
     * 账号id
     */
    @NotNull(message = "uid can not null")
    private String uid;


    /**
     * 员工邮箱
     */
    @NotNull(message = "email can not null")
    private String email;


    /**
     * 员工手机号
     */
    @NotNull(message = "phone can not null")
    private String phone;


    /**
     * 员工姓名
     */
    @NotNull(message = "name can not null")
    private String name;


    /**
     * 员工昵称
     */
    @NotNull(message = "nickname can not null")
    private String nickname;


    /**
     * 员工头像(相对路径)
     */
    @NotNull(message = "avatar can not null")
    private String avatar;


    /**
     * 员工性别
     */
    @NotNull(message = "gender can not null")
    private String gender;


    /**
     * 创建时间
     */
    @NotNull(message = "createAt can not null")
    private Integer createAt;


    /**
     * 更新时间
     */
    @NotNull(message = "updateAt can not null")
    private Integer updateAt;

}
