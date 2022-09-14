package org.skyshop.vo;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class AccountPlatformVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 自增id
     */
    @NotNull(message = "id can not null")
    private String id;


    /**
     * 账号id
     */
    @NotNull(message = "uid can not null")
    private String uid;


    /**
     * 平台id
     */
    @NotNull(message = "platformId can not null")
    private String platformId;


    /**
     * 平台access_token
     */
    @NotNull(message = "platformToken can not null")
    private String platformToken;


    /**
     * 平台类型 0:未知,1:facebook,2:google,3:wechat,4:qq,5:weibo,6:twitter
     */
    @NotNull(message = "type can not null")
    private Integer type;


    /**
     * 昵称
     */
    @NotNull(message = "nickname can not null")
    private String nickname;


    /**
     * 头像
     */
    @NotNull(message = "avatar can not null")
    private String avatar;


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
