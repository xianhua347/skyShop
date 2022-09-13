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
 * 员工角色
 */
@Entity
@ApiModel("员工角色")
@Table(name = "auth_role")
public class AuthRole {

    /**
     * 自增id
     */
    @Id
    @ApiModelProperty("自增id")
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 角色名称
     */
    @ApiModelProperty("角色名称")
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 角描述
     */
    @ApiModelProperty("角描述")
    @Column(name = "desc", nullable = false)
    private String desc;

    /**
     * 权限集合 多个值,号隔开
     */
    @Column(name = "auth_item_set")
    @ApiModelProperty("权限集合 多个值,号隔开")
    private String authItemSet;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @Column(name = "create_at", nullable = false)
    private Integer createAt;

    /**
     * 创建人staff_id
     */
    @ApiModelProperty("创建人staff_id")
    @Column(name = "create_by", nullable = false)
    private Integer createBy;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    @Column(name = "update_at", nullable = false)
    private Integer updateAt;

    /**
     * 修改人staff_id
     */
    @ApiModelProperty("修改人staff_id")
    @Column(name = "update_by", nullable = false)
    private Integer updateBy;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    @Column(name = "status", nullable = false)
    @ApiModelProperty("状态 1:enable, 0:disable, -1:deleted")
    private Integer status;

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
     * 角色名称
     */
    public void setName(String name) {
        this.name = name;
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
    public void setDesc(String desc) {
        this.desc = desc;
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
    public void setAuthItemSet(String authItemSet) {
        this.authItemSet = authItemSet;
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
     * 创建人staff_id
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
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
    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
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
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
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
