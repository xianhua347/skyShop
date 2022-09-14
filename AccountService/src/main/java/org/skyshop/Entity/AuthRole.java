package org.skyshop.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 员工角色
 */
@Entity
@Table(name = "auth_role")
public class AuthRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 角色名称
     */
    @Column(name = "name", nullable = false)
    private String name = "0";

    /**
     * 角描述
     */
    @Column(name = "desc", nullable = false)
    private String desc = "0";

    /**
     * 权限集合 多个值,号隔开
     */
    @Column(name = "auth_item_set")
    private String authItemSet;

    /**
     * 创建时间
     */
    @Column(name = "create_at", nullable = false)
    private Integer createAt = 0;

    /**
     * 创建人staff_id
     */
    @Column(name = "create_by", nullable = false)
    private Integer createBy = 0;

    /**
     * 更新时间
     */
    @Column(name = "update_at", nullable = false)
    private Integer updateAt = 0;

    /**
     * 修改人staff_id
     */
    @Column(name = "update_by", nullable = false)
    private Integer updateBy = 0;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    @Column(name = "status", nullable = false)
    private Integer status = 0;

    /**
     * 自增id
     */
    public AuthRole setId(String id) {
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
     * 角色名称
     */
    public AuthRole setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 角描述
     */
    public AuthRole setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 角描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 权限集合 多个值,号隔开
     */
    public AuthRole setAuthItemSet(String authItemSet) {
        this.authItemSet = authItemSet;
        return this;
    }

    /**
     * 权限集合 多个值,号隔开
     */
    public String getAuthItemSet() {
        return authItemSet;
    }

    /**
     * 创建时间
     */
    public AuthRole setCreateAt(Integer createAt) {
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
     * 创建人staff_id
     */
    public AuthRole setCreateBy(Integer createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人staff_id
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 更新时间
     */
    public AuthRole setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间
     */
    public Integer getUpdateAt() {
        return updateAt;
    }

    /**
     * 修改人staff_id
     */
    public AuthRole setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 修改人staff_id
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    public AuthRole setStatus(Integer status) {
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
        return "AuthRole{" +
                "id=" + id + '\'' +
                "name=" + name + '\'' +
                "desc=" + desc + '\'' +
                "authItemSet=" + authItemSet + '\'' +
                "createAt=" + createAt + '\'' +
                "createBy=" + createBy + '\'' +
                "updateAt=" + updateAt + '\'' +
                "updateBy=" + updateBy + '\'' +
                "status=" + status + '\'' +
                '}';
    }
}
