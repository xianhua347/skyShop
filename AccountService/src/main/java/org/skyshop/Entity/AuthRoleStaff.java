package org.skyshop.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 权限角色与员工关系
 */
@Entity
@Table(name = "auth_role_staff")
public class AuthRoleStaff implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 员工id
     */
    @Column(name = "staff_id", nullable = false)
    private String staffId = "0";

    /**
     * 角色集合 多个值,号隔开
     */
    @Column(name = "role_set")
    private String roleSet;

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
    public AuthRoleStaff setId(String id) {
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
     * 员工id
     */
    public AuthRoleStaff setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }

    /**
     * 员工id
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * 角色集合 多个值,号隔开
     */
    public AuthRoleStaff setRoleSet(String roleSet) {
        this.roleSet = roleSet;
        return this;
    }

    /**
     * 角色集合 多个值,号隔开
     */
    public String getRoleSet() {
        return roleSet;
    }

    /**
     * 创建时间
     */
    public AuthRoleStaff setCreateAt(Integer createAt) {
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
    public AuthRoleStaff setCreateBy(Integer createBy) {
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
    public AuthRoleStaff setUpdateAt(Integer updateAt) {
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
    public AuthRoleStaff setUpdateBy(Integer updateBy) {
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
    public AuthRoleStaff setStatus(Integer status) {
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
        return "AuthRoleStaff{" +
                "id=" + id + '\'' +
                "staffId=" + staffId + '\'' +
                "roleSet=" + roleSet + '\'' +
                "createAt=" + createAt + '\'' +
                "createBy=" + createBy + '\'' +
                "updateAt=" + updateAt + '\'' +
                "updateBy=" + updateBy + '\'' +
                "status=" + status + '\'' +
                '}';
    }
}
