package org.skyshop.dto;


import java.io.Serializable;

public class AccountPlatformDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    private String id;


    /**
     * 账号id
     */
    private String uid;


    /**
     * 平台id
     */
    private String platformId;


    /**
     * 平台access_token
     */
    private String platformToken;


    /**
     * 平台类型 0:未知,1:facebook,2:google,3:wechat,4:qq,5:weibo,6:twitter
     */
    private Integer type;


    /**
     * 昵称
     */
    private String nickname;


    /**
     * 头像
     */
    private String avatar;


    /**
     * 创建时间
     */
    private Integer createAt;


    /**
     * 更新时间
     */
    private Integer updateAt;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
