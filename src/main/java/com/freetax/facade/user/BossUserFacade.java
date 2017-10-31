package com.freetax.facade.user;

import com.freetax.mybatis.bossUser.entity.BossUser;
import com.freetax.mybatis.bossUser.service.BossUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author shuxf
 * @Date 2017/10/30 15:59
 */
@Service
public class BossUserFacade {

    private static Logger log = LoggerFactory.getLogger(BossUserFacade.class);

    @Autowired
    private BossUserService bossUserService;

    public BossUser getByUsername(String username) {
        return bossUserService.getBossUserByUsername(username);
    }

    public BossUser getUserByPhone(String phone) {
        return bossUserService.queryAdminUserByPhone(phone);
    }

}
