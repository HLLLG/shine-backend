package com.hlllg.shine.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hlllg.shine.service.TeamService;
import generator.domain.Team;
import generator.mapper.TeamMapper;
import generator.service.TeamService;
import org.springframework.stereotype.Service;

/**
* @author Lenovo
* @description 针对表【team(队伍)】的数据库操作Service实现
* @createDate 2024-03-20 10:30:22
*/
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team>
    implements TeamService {

}




