package com.hlllg.shine.model.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hlllg
 * @Date 2024/3/20 15:01
 * 加入队伍请求体
 */
@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = -339768804053020149L;

    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;

}
