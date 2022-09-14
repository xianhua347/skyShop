package org.skyshop.vo;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class SkrMemberVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 用户id
     */
    @NotNull(message = "id can not null")
    private String id;


    /**
     * 账号id
     */
    @NotNull(message = "uid can not null")
    private String uid;


    /**
     * 昵称
     */
    @NotNull(message = "nickname can not null")
    private String nickname;


    /**
     * 头像(相对路径)
     */
    @NotNull(message = "avatar can not null")
    private String avatar;


    /**
     * 性别
     */
    @NotNull(message = "gender can not null")
    private String gender;


    /**
     * 角色 0:普通用户 1:vip
     */
    @NotNull(message = "role can not null")
    private String role;


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
