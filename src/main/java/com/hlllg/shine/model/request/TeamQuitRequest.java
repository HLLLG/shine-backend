package com.hlllg.shine.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hlllg
 * @Date 2024/3/20 15:01
 * 用户退出队伍请求体
 */
@Data
public class TeamQuitRequest implements Serializable {

    private static final long serialVersionUID = -339768804053020149L;

    /**
     * id
     */
    private Long teamId;

}
