package com.freetax.facade.im;

import com.freetax.mybatis.imuser.entity.ImUser;
import com.freetax.mybatis.imuser.service.ImUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 网易云通讯接口
 *
 * @Author zhuangyuhao
 * @Date 2017/3/6 17:07
 */
@Service
public class ImFacade {

    private static Logger log = LoggerFactory.getLogger(ImFacade.class);

    @Autowired
    private ImUserService imUserService;

    public ImUser getImuser(Integer uid, Integer type) {
        return imUserService.selectByUserid(uid, type);
    }

}
