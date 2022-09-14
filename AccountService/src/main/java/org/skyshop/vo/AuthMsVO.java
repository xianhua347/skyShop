package org.skyshop.vo;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class AuthMsVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 自增id
     */
    @NotNull(message = "id can not null")
    private String id;


    /**
     * 系统名称
     */
    @NotNull(message = "msName can not null")
    private String msName;


    /**
     * 系描述
     */
    @NotNull(message = "msDesc can not null")
    private String msDesc;


    /**
     * 系统域名
     */
    @NotNull(message = "msDomain can not null")
    private String msDomain;


    /**
     * 创建时间
     */
    @NotNull(message = "createAt can not null")
    private Integer createAt;


    /**
     * 创建人staff_id
     */
    @NotNull(message = "createBy can not null")
    private Integer createBy;


    /**
     * 更新时间
     */
    @NotNull(message = "updateAt can not null")
    private Integer updateAt;


    /**
     * 修改人staff_id
     */
    @NotNull(message = "updateBy can not null")
    private Integer updateBy;


    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    @NotNull(message = "status can not null")
    private Integer status;

}
