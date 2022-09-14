package org.skyshop.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 账户信息
 */
@Entity
@Table(name = "skr_member")
public class SkrMember implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
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
     * 昵称
     */
    @Column(name = "nickname", nullable = false)
    private String nickname = "";

    /**
     * 头像(相对路径)
     */
    @Column(name = "avatar", nullable = false)
    private String avatar = "";

    /**
     * 性别
     */
    @Column(name = "gender", nullable = false)
    private String gender = "unknow";

    /**
     * 角色 0:普通用户 1:vip
     */
    @Column(name = "role", nullable = false)
    private String role = "0";

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
     * 用户id
     */
    public SkrMember setId(String id) {
        this.id = id;
        return this;
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
    public SkrMember setUid(String uid) {
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
     * 昵称
     */
    public SkrMember setNickname(String nickname) {
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
     * 头像(相对路径)
     */
    public SkrMember setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
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
    public SkrMember setGender(String gender) {
        this.gender = gender;
        return this;
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
    public SkrMember setRole(String role) {
        this.role = role;
        return this;
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
    public SkrMember setCreateAt(Integer createAt) {
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
    public SkrMember setUpdateAt(Integer updateAt) {
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
