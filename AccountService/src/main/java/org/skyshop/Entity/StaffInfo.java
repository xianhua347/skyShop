package org.skyshop.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "staff_info")
public class StaffInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工id
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
     * 员工邮箱
     */
    @Column(name = "email", nullable = false)
    private String email = "";

    /**
     * 员工手机号
     */
    @Column(name = "phone", nullable = false)
    private String phone = "";

    /**
     * 员工姓名
     */
    @Column(name = "name", nullable = false)
    private String name = "";

    /**
     * 员工昵称
     */
    @Column(name = "nickname", nullable = false)
    private String nickname = "";

    /**
     * 员工头像(相对路径)
     */
    @Column(name = "avatar", nullable = false)
    private String avatar = "";

    /**
     * 员工性别
     */
    @Column(name = "gender", nullable = false)
    private String gender = "unknow";

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
     * 员工id
     */
    public StaffInfo setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 员工id
     */
    public String getId() {
        return id;
    }

    /**
     * 账号id
     */
    public StaffInfo setUid(String uid) {
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
     * 员工邮箱
     */
    public StaffInfo setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 员工邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 员工手机号
     */
    public StaffInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 员工手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 员工姓名
     */
    public StaffInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 员工姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 员工昵称
     */
    public StaffInfo setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * 员工昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 员工头像(相对路径)
     */
    public StaffInfo setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    /**
     * 员工头像(相对路径)
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 员工性别
     */
    public StaffInfo setGender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * 员工性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 创建时间
     */
    public StaffInfo setCreateAt(Integer createAt) {
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
    public StaffInfo setUpdateAt(Integer updateAt) {
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
        return "StaffInfo{" +
                "id=" + id + '\'' +
                "uid=" + uid + '\'' +
                "email=" + email + '\'' +
                "phone=" + phone + '\'' +
                "name=" + name + '\'' +
                "nickname=" + nickname + '\'' +
                "avatar=" + avatar + '\'' +
                "gender=" + gender + '\'' +
                "createAt=" + createAt + '\'' +
                "updateAt=" + updateAt + '\'' +
                '}';
    }
}
