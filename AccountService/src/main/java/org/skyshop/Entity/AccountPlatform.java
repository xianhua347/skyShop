package org.skyshop.Entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;

/**
 * 第三方用户信息
 */
@Entity
@ApiModel("第三方用户信息")
@Table(name = "account_platform")
public class AccountPlatform {

    /**
     * 自增id
     */
    @Id
    @ApiModelProperty("自增id")
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 账号id
     */
    @ApiModelProperty("账号id")
    @Column(name = "uid", nullable = false)
    private String uid;

    /**
     * 平台id
     */
    @ApiModelProperty("平台id")
    @Column(name = "platform_id", nullable = false)
    private String platformId;

    /**
     * 平台access_token
     */
    @ApiModelProperty("平台access_token")
    @Column(name = "platform_token", nullable = false)
    private String platformToken;

    /**
     * 平台类型 0:未知,1:facebook,2:google,3:wechat,4:qq,5:weibo,6:twitter
     */
    @Column(name = "type", nullable = false)
    @ApiModelProperty("平台类型 0:未知,1:facebook,2:google,3:wechat,4:qq,5:weibo,6:twitter")
    private Integer type;

    /**
     * 昵称
     */
    @ApiModelProperty("昵称")
    @Column(name = "nickname", nullable = false)
    private String nickname;

    /**
     * 头像
     */
    @ApiModelProperty("头像")
    @Column(name = "avatar", nullable = false)
    private String avatar;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @Column(name = "create_at", nullable = false)
    private Integer createAt;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    @Column(name = "update_at", nullable = false)
    private Integer updateAt;

    /**
     * 自增id
     */
    public void setId(String id) {
        this.id = id;
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
    public void setUid(String uid) {
        this.uid = uid;
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
    public void setPlatformId(String platformId) {
        this.platformId = platformId;
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
    public void setPlatformToken(String platformToken) {
        this.platformToken = platformToken;
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
    public void setType(Integer type) {
        this.type = type;
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
    public void setNickname(String nickname) {
        this.nickname = nickname;
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
    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
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
    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
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
