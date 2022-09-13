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
 * 账户
 */
@Entity
@ApiModel("账户")
@Table(name = "account_user")
public class AccountUser {

    /**
     * 账号id
     */
    @Id
    @ApiModelProperty("账号id")
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    @Column(name = "email", nullable = false)
    private String email;

    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    @Column(name = "phone", nullable = false)
    private String phone;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    @Column(name = "username", nullable = false)
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    @Column(name = "password", nullable = false)
    private String password;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @Column(name = "create_at", nullable = false)
    private Integer createAt;

    /**
     * 创建ip
     */
    @ApiModelProperty("创建ip")
    @Column(name = "create_ip_at", nullable = false)
    private String createIpAt;

    /**
     * 最后一次登录时间
     */
    @ApiModelProperty("最后一次登录时间")
    @Column(name = "last_login_at", nullable = false)
    private Integer lastLoginAt;

    /**
     * 最后一次登录ip
     */
    @ApiModelProperty("最后一次登录ip")
    @Column(name = "last_login_ip_at", nullable = false)
    private String lastLoginIpAt;

    /**
     * 登录次数
     */
    @ApiModelProperty("登录次数")
    @Column(name = "login_times", nullable = false)
    private Integer loginTimes;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    @Column(name = "status", nullable = false)
    @ApiModelProperty("状态 1:enable, 0:disable, -1:deleted")
    private Integer status;

    /**
     * 账号id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 账号id
     */
    public String getId() {
        return id;
    }

    /**
     * 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 密码
     */
    public String getPassword() {
        return password;
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
     * 创建ip
     */
    public void setCreateIpAt(String createIpAt) {
        this.createIpAt = createIpAt;
    }

    /**
     * 创建ip
     */
    public String getCreateIpAt() {
        return createIpAt;
    }

    /**
     * 最后一次登录时间
     */
    public void setLastLoginAt(Integer lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    /**
     * 最后一次登录时间
     */
    public Integer getLastLoginAt() {
        return lastLoginAt;
    }

    /**
     * 最后一次登录ip
     */
    public void setLastLoginIpAt(String lastLoginIpAt) {
        this.lastLoginIpAt = lastLoginIpAt;
    }

    /**
     * 最后一次登录ip
     */
    public String getLastLoginIpAt() {
        return lastLoginIpAt;
    }

    /**
     * 登录次数
     */
    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    /**
     * 登录次数
     */
    public Integer getLoginTimes() {
        return loginTimes;
    }

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    public Integer getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "AccountUser{" +
                "id=" + id + '\'' +
                "email=" + email + '\'' +
                "phone=" + phone + '\'' +
                "username=" + username + '\'' +
                "password=" + password + '\'' +
                "createAt=" + createAt + '\'' +
                "createIpAt=" + createIpAt + '\'' +
                "lastLoginAt=" + lastLoginAt + '\'' +
                "lastLoginIpAt=" + lastLoginIpAt + '\'' +
                "loginTimes=" + loginTimes + '\'' +
                "status=" + status + '\'' +
                '}';
    }
}
