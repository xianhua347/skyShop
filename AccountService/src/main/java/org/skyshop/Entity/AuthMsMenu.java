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
 * 系统menu
 */
@Entity
@ApiModel("系统menu")
@Table(name = "auth_ms_menu")
public class AuthMsMenu {

    /**
     * 自增id
     */
    @Id
    @ApiModelProperty("自增id")
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 系统id
     */
    @ApiModelProperty("系统id")
    @Column(name = "ms_id", nullable = false)
    private String msId;

    /**
     * 父菜单id
     */
    @ApiModelProperty("父菜单id")
    @Column(name = "parent_id", nullable = false)
    private String parentId;

    /**
     * 菜单名称
     */
    @ApiModelProperty("菜单名称")
    @Column(name = "menu_name", nullable = false)
    private String menuName;

    /**
     * 菜描述
     */
    @ApiModelProperty("菜描述")
    @Column(name = "menu_desc", nullable = false)
    private String menuDesc;

    /**
     * 菜单uri
     */
    @ApiModelProperty("菜单uri")
    @Column(name = "menu_uri", nullable = false)
    private String menuUri;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @Column(name = "create_at", nullable = false)
    private Integer createAt;

    /**
     * 是否展示菜单
     */
    @ApiModelProperty("是否展示菜单")
    @Column(name = "is_show", nullable = false)
    private Boolean show;

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
     * 系统id
     */
    public void setMsId(String msId) {
        this.msId = msId;
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
    public void setParentId(String parentId) {
        this.parentId = parentId;
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
    public void setMenuName(String menuName) {
        this.menuName = menuName;
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
    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
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
    public void setMenuUri(String menuUri) {
        this.menuUri = menuUri;
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
     * 是否展示菜单
     */
    public void setShow(Boolean show) {
        this.show = show;
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
