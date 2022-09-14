package org.skyshop.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 账户
 */
@Entity
@Table(name = "account_user")
public class AccountUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账号id
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 邮箱
     */
    @Column(name = "email", nullable = false)
    private String email = "";

    /**
     * 手机号
     */
    @Column(name = "phone", nullable = false)
    private String phone = "";

    /**
     * 用户名
     */
    @Column(name = "username", nullable = false)
    private String username = "";

    /**
     * 密码
     */
    @Column(name = "password", nullable = false)
    private String password = "";

    /**
     * 创建时间
     */
    @Column(name = "create_at", nullable = false)
    private Integer createAt = 0;

    /**
     * 创建ip
     */
    @Column(name = "create_ip_at", nullable = false)
    private String createIpAt = "";

    /**
     * 最后一次登录时间
     */
    @Column(name = "last_login_at", nullable = false)
    private Integer lastLoginAt = 0;

    /**
     * 最后一次登录ip
     */
    @Column(name = "last_login_ip_at", nullable = false)
    private String lastLoginIpAt = "";

    /**
     * 登录次数
     */
    @Column(name = "login_times", nullable = false)
    private Integer loginTimes = 0;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    @Column(name = "status", nullable = false)
    private Integer status = 0;

    /**
     * 账号id
     */
    public AccountUser setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 账号id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 邮箱
     */
    public AccountUser setEmail(String email) {
        this.email = email;
        return this;
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
    public AccountUser setPhone(String phone) {
        this.phone = phone;
        return this;
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
    public AccountUser setUsername(String username) {
        this.username = username;
        return this;
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
    public AccountUser setPassword(String password) {
        this.password = password;
        return this;
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
    public AccountUser setCreateAt(Integer createAt) {
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
     * 创建ip
     */
    public AccountUser setCreateIpAt(String createIpAt) {
        this.createIpAt = createIpAt;
        return this;
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
    public AccountUser setLastLoginAt(Integer lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
        return this;
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
    public AccountUser setLastLoginIpAt(String lastLoginIpAt) {
        this.lastLoginIpAt = lastLoginIpAt;
        return this;
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
    public AccountUser setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
        return this;
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
    public AccountUser setStatus(Integer status) {
        this.status = status;
        return this;
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
