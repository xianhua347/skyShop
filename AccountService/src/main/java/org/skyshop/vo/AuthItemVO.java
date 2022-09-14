package org.skyshop.vo;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class AuthItemVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 自增id
     */
    @NotNull(message = "id can not null")
    private String id;


    /**
     * 系统id
     */
    @NotNull(message = "msId can not null")
    private String msId;


    /**
     * 页面/接口uri
     */
    @NotNull(message = "menuId can not null")
    private String menuId;


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
