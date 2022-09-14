package org.skyshop.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 第三方用户信息
 */
@Entity
@Table(name = "account_platform")
public class AccountPlatform implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 账号id
     */
    @Column(name = "uid", nullable = false)
    private String uid = "0";

    /**
     * 平台id
     */
    @Column(name = "platform_id", nullable = false)
    private String platformId = "";

    /**
     * 平台access_token
     */
    @Column(name = "platform_token", nullable = false)
    private String platformToken = "";

    /**
     * 平台类型 0:未知,1:facebook,2:google,3:wechat,4:qq,5:weibo,6:twitter
     */
    @Column(name = "type", nullable = false)
    private Integer type = 0;

    /**
     * 昵称
     */
    @Column(name = "nickname", nullable = false)
    private String nickname = "";

    /**
     * 头像
     */
    @Column(name = "avatar", nullable = false)
    private String avatar = "";

    /**
     * 创建时间
     */
    @Column(name = "create_at", nullable = false)
    private Integer createAt = 0;

    /**
     * 更新时间
     */
    @Column(name = "update_at", nullable = false)
    private Integer updateAt = 0;

    /**
     * 自增id
     */
    public AccountPlatform setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自增id
     */
    public String getId() {
        return id;
    }

    /**
     * 账号id
     */
    public AccountPlatform setUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 账号id
     */
    public String getUid() {
        return uid;
    }

    /**
     * 平台id
     */
    public AccountPlatform setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }

    /**
     * 平台id
     */
    public String getPlatformId() {
        return platformId;
    }

    /**
     * 平台access_token
     */
    public AccountPlatform setPlatformToken(String platformToken) {
        this.platformToken = platformToken;
        return this;
    }

    /**
     * 平台access_token
     */
    public String getPlatformToken() {
        return platformToken;
    }

    /**
     * 平台类型 0:未知,1:facebook,2:google,3:wechat,4:qq,5:weibo,6:twitter
     */
    public AccountPlatform setType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 平台类型 0:未知,1:facebook,2:google,3:wechat,4:qq,5:weibo,6:twitter
     */
    public Integer getType() {
        return type;
    }

    /**
     * 昵称
     */
    public AccountPlatform setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 头像
     */
    public AccountPlatform setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    /**
     * 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 创建时间
     */
    public AccountPlatform setCreateAt(Integer createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     */
    public Integer getCreateAt() {
        return createAt;
    }

    /**
     * 更新时间
     */
    public AccountPlatform setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间
     */
    public Integer getUpdateAt() {
        return updateAt;
    }

    @Override
    public String toString() {
        return "AccountPlatform{" +
                "id=" + id + '\'' +
                "uid=" + uid + '\'' +
                "platformId=" + platformId + '\'' +
                "platformToken=" + platformToken + '\'' +
                "type=" + type + '\'' +
                "nickname=" + nickname + '\'' +
                "avatar=" + avatar + '\'' +
                "createAt=" + createAt + '\'' +
                "updateAt=" + updateAt + '\'' +
                '}';
    }
}
