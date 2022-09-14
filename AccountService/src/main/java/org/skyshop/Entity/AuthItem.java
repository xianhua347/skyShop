package org.skyshop.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 系统权限
 */
@Entity
@Table(name = "auth_item")
public class AuthItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 系统id
     */
    @Column(name = "ms_id", nullable = false)
    private String msId = "0";

    /**
     * 页面/接口uri
     */
    @Column(name = "menu_id", nullable = false)
    private String menuId = "0";

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
    public AuthItem setId(String id) {
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
     * 系统id
     */
    public AuthItem setMsId(String msId) {
        this.msId = msId;
        return this;
    }

    /**
     * 系统id
     */
    public String getMsId() {
        return msId;
    }

    /**
     * 页面/接口uri
     */
    public AuthItem setMenuId(String menuId) {
        this.menuId = menuId;
        return this;
    }

    /**
     * 页面/接口uri
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * 创建时间
     */
    public AuthItem setCreateAt(Integer createAt) {
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
    public AuthItem setCreateBy(Integer createBy) {
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
    public AuthItem setUpdateAt(Integer updateAt) {
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
    public AuthItem setUpdateBy(Integer updateBy) {
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
    public AuthItem setStatus(Integer status) {
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
        return "AuthItem{" +
                "id=" + id + '\'' +
                "msId=" + msId + '\'' +
                "menuId=" + menuId + '\'' +
                "createAt=" + createAt + '\'' +
                "createBy=" + createBy + '\'' +
                "updateAt=" + updateAt + '\'' +
                "updateBy=" + updateBy + '\'' +
                "status=" + status + '\'' +
                '}';
    }
}
