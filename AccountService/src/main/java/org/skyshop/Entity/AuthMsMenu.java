package org.skyshop.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 系统menu
 */
@Entity
@Table(name = "auth_ms_menu")
public class AuthMsMenu implements Serializable {

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
     * 父菜单id
     */
    @Column(name = "parent_id", nullable = false)
    private String parentId = "0";

    /**
     * 菜单名称
     */
    @Column(name = "menu_name", nullable = false)
    private String menuName = "0";

    /**
     * 菜描述
     */
    @Column(name = "menu_desc", nullable = false)
    private String menuDesc = "0";

    /**
     * 菜单uri
     */
    @Column(name = "menu_uri", nullable = false)
    private String menuUri = "0";

    /**
     * 创建时间
     */
    @Column(name = "create_at", nullable = false)
    private Integer createAt = 0;

    /**
     * 是否展示菜单
     */
    @Column(name = "is_show", nullable = false)
    private Boolean show = Boolean.FALSE;

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
    public AuthMsMenu setId(String id) {
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
    public AuthMsMenu setMsId(String msId) {
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
     * 父菜单id
     */
    public AuthMsMenu setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父菜单id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 菜单名称
     */
    public AuthMsMenu setMenuName(String menuName) {
        this.menuName = menuName;
        return this;
    }

    /**
     * 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 菜描述
     */
    public AuthMsMenu setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
        return this;
    }

    /**
     * 菜描述
     */
    public String getMenuDesc() {
        return menuDesc;
    }

    /**
     * 菜单uri
     */
    public AuthMsMenu setMenuUri(String menuUri) {
        this.menuUri = menuUri;
        return this;
    }

    /**
     * 菜单uri
     */
    public String getMenuUri() {
        return menuUri;
    }

    /**
     * 创建时间
     */
    public AuthMsMenu setCreateAt(Integer createAt) {
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
     * 是否展示菜单
     */
    public AuthMsMenu setShow(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 是否展示菜单
     */
    public Boolean isShow() {
        return show;
    }

    /**
     * 创建人staff_id
     */
    public AuthMsMenu setCreateBy(Integer createBy) {
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
    public AuthMsMenu setUpdateAt(Integer updateAt) {
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
    public AuthMsMenu setUpdateBy(Integer updateBy) {
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
    public AuthMsMenu setStatus(Integer status) {
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
        return "AuthMsMenu{" +
                "id=" + id + '\'' +
                "msId=" + msId + '\'' +
                "parentId=" + parentId + '\'' +
                "menuName=" + menuName + '\'' +
                "menuDesc=" + menuDesc + '\'' +
                "menuUri=" + menuUri + '\'' +
                "createAt=" + createAt + '\'' +
                "show=" + show + '\'' +
                "createBy=" + createBy + '\'' +
                "updateAt=" + updateAt + '\'' +
                "updateBy=" + updateBy + '\'' +
                "status=" + status + '\'' +
                '}';
    }
}
