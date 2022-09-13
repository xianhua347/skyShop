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
 * 系统map(登记目前存在的后台系统信息)
 */
@Entity
@Table(name = "auth_ms")
@ApiModel("系统map(登记目前存在的后台系统信息)")
public class AuthMs {

    /**
     * 自增id
     */
    @Id
    @ApiModelProperty("自增id")
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 系统名称
     */
    @ApiModelProperty("系统名称")
    @Column(name = "ms_name", nullable = false)
    private String msName;

    /**
     * 系描述
     */
    @ApiModelProperty("系描述")
    @Column(name = "ms_desc", nullable = false)
    private String msDesc;

    /**
     * 系统域名
     */
    @ApiModelProperty("系统域名")
    @Column(name = "ms_domain", nullable = false)
    private String msDomain;

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
     * 系统名称
     */
    public void setMsName(String msName) {
        this.msName = msName;
    }

    /**
     * 系统名称
     */
    public String getMsName() {
        return msName;
    }

    /**
     * 系描述
     */
    public void setMsDesc(String msDesc) {
        this.msDesc = msDesc;
    }

    /**
     * 系描述
     */
    public String getMsDesc() {
        return msDesc;
    }

    /**
     * 系统域名
     */
    public void setMsDomain(String msDomain) {
        this.msDomain = msDomain;
    }

    /**
     * 系统域名
     */
    public String getMsDomain() {
        return msDomain;
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
        return "AuthMs{" +
                "id=" + id + '\'' +
                "msName=" + msName + '\'' +
                "msDesc=" + msDesc + '\'' +
                "msDomain=" + msDomain + '\'' +
                "createAt=" + createAt + '\'' +
                "createBy=" + createBy + '\'' +
                "updateAt=" + updateAt + '\'' +
                "updateBy=" + updateBy + '\'' +
                "status=" + status + '\'' +
                '}';
    }
}
