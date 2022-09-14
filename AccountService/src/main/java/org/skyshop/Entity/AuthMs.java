package org.skyshop.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 系统map(登记目前存在的后台系统信息)
 */
@Entity
@Table(name = "auth_ms")
public class AuthMs implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 系统名称
     */
    @Column(name = "ms_name", nullable = false)
    private String msName = "0";

    /**
     * 系描述
     */
    @Column(name = "ms_desc", nullable = false)
    private String msDesc = "0";

    /**
     * 系统域名
     */
    @Column(name = "ms_domain", nullable = false)
    private String msDomain = "0";

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
    public AuthMs setId(String id) {
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
     * 系统名称
     */
    public AuthMs setMsName(String msName) {
        this.msName = msName;
        return this;
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
    public AuthMs setMsDesc(String msDesc) {
        this.msDesc = msDesc;
        return this;
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
    public AuthMs setMsDomain(String msDomain) {
        this.msDomain = msDomain;
        return this;
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
    public AuthMs setCreateAt(Integer createAt) {
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
    public AuthMs setCreateBy(Integer createBy) {
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
    public AuthMs setUpdateAt(Integer updateAt) {
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
    public AuthMs setUpdateBy(Integer updateBy) {
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
    public AuthMs setStatus(Integer status) {
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
