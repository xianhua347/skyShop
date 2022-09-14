package org.skyshop.dto;


import java.io.Serializable;

public class SkrMemberDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String id;


    /**
     * 账号id
     */
    private String uid;


    /**
     * 昵称
     */
    private String nickname;


    /**
     * 头像(相对路径)
     */
    private String avatar;


    /**
     * 性别
     */
    private String gender;


    /**
     * 角色 0:普通用户 1:vip
     */
    private String role;


    /**
     * 创建时间
     */
    private Integer createAt;


    /**
     * 更新时间
     */
    private Integer updateAt;

}
