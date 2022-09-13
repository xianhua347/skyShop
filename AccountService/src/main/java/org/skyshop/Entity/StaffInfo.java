package org.skyshop.Entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;

@Entity
@Table(name = "staff_info")
public class StaffInfo {

    /**
     * 员工id
     */
    @Id
    @ApiModelProperty("员工id")
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
     * 员工邮箱
     */
    @ApiModelProperty("员工邮箱")
    @Column(name = "email", nullable = false)
    private String email;

    /**
     * 员工手机号
     */
    @ApiModelProperty("员工手机号")
    @Column(name = "phone", nullable = false)
    private String phone;

    /**
     * 员工姓名
     */
    @ApiModelProperty("员工姓名")
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 员工昵称
     */
    @ApiModelProperty("员工昵称")
    @Column(name = "nickname", nullable = false)
    private String nickname;

    /**
     * 员工头像(相对路径)
     */
    @ApiModelProperty("员工头像(相对路径)")
    @Column(name = "avatar", nullable = false)
    private String avatar;

    /**
     * 员工性别
     */
    @ApiModelProperty("员工性别")
    @Column(name = "gender", nullable = false)
    private String gender;

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
     * 员工id
     */
    public void setId(String id) {
        this.id = id;
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
     * 员工邮箱
     */
    public void setEmail(String email) {
        this.email = email;
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
    public void setPhone(String phone) {
        this.phone = phone;
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
    public void setName(String name) {
        this.name = name;
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
    public void setNickname(String nickname) {
        this.nickname = nickname;
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
    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
    public void setGender(String gender) {
        this.gender = gender;
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
