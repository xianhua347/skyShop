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
 * 账户信息
 */
@Entity
@ApiModel("账户信息")
@Table(name = "skr_member")
public class SkrMember {

    /**
     * 用户id
     */
    @Id
    @ApiModelProperty("用户id")
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
     * 昵称
     */
    @ApiModelProperty("昵称")
    @Column(name = "nickname", nullable = false)
    private String nickname;

    /**
     * 头像(相对路径)
     */
    @ApiModelProperty("头像(相对路径)")
    @Column(name = "avatar", nullable = false)
    private String avatar;

    /**
     * 性别
     */
    @ApiModelProperty("性别")
    @Column(name = "gender", nullable = false)
    private String gender;

    /**
     * 角色 0:普通用户 1:vip
     */
    @ApiModelProperty("角色 0:普通用户 1:vip")
    @Column(name = "role", nullable = false)
    private String role;

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
     * 用户id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户id
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
     * 头像(相对路径)
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 头像(相对路径)
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 角色 0:普通用户 1:vip
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 角色 0:普通用户 1:vip
     */
    public String getRole() {
        return role;
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
        return "SkrMember{" +
                "id=" + id + '\'' +
                "uid=" + uid + '\'' +
                "nickname=" + nickname + '\'' +
                "avatar=" + avatar + '\'' +
                "gender=" + gender + '\'' +
                "role=" + role + '\'' +
                "createAt=" + createAt + '\'' +
                "updateAt=" + updateAt + '\'' +
                '}';
    }
}
