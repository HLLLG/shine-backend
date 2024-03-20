package com.hlllg.shine.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hlllg.shine.model.domain.Team;
import com.hlllg.shine.model.domain.User;

/**
* @author Lenovo
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2024-03-20 10:30:22
*/
public interface TeamService extends IService<Team> {

    /**
     * 创建用户
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);
}
