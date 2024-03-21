package com.hlllg.shine.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hlllg.shine.model.domain.Team;
import com.hlllg.shine.model.domain.User;
import com.hlllg.shine.model.dto.TeamQuery;
import com.hlllg.shine.model.request.TeamJoinRequest;
import com.hlllg.shine.model.request.TeamQuitRequest;
import com.hlllg.shine.model.request.TeamUpdateRequest;
import com.hlllg.shine.model.vo.TeamUserVO;

import java.util.List;

/**
* @author Lenovo
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2024-03-20 10:30:22
*/
public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 搜索队伍
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     *
     * @param teamJoinRequest
     * @param loginUser
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 离开队伍
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 删除队伍
     *
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(Long id, User loginUser);
}
