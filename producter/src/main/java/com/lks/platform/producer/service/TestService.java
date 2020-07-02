package com.lks.platform.producer.service;

import com.alibaba.fastjson.JSON;

import com.lks.platform.sdk.ITestService;
import com.lks.platform.sdk.vo.QueryVo;
import com.lks.platform.sdk.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestService implements ITestService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Override
    public List<UserVo> getUserList1(String userId, QueryVo query1, QueryVo query2) {
        logger.info("【1】本次收到参数:userId:{},query1:{},query2:{}", userId,
                JSON.toJSONString(query1),JSON.toJSONString(query2));

        UserVo user=new UserVo();
        user.setAddr("深圳");
        user.setName("张三");
        user.setAddr("18");
        user.setGender("男");

        List<UserVo.Friend> list=new ArrayList<>();
        for(int i=0;i<2;i++){
            UserVo.Friend friend=new UserVo.Friend();
            friend.setAddr("北京"+i);
            friend.setNickname("刘"+i);
            friend.setPhone("image0"+i);

            list.add(friend);
        }

        user.setFriend(list);

        List<UserVo> result=new ArrayList<>();
        result.add(user);

        return result;
    }

    @Override
    public List<UserVo> getUserList2(String userId, QueryVo query1) {
        logger.info("【2】本次收到参数:userId:{},query1:{}", userId,
                JSON.toJSONString(query1));

        UserVo user=new UserVo();
        user.setAddr("深圳");
        user.setName("张三");
        user.setAddr("18");
        user.setGender("男");

        List<UserVo.Friend> list=new ArrayList<>();
        for(int i=0;i<2;i++){
            UserVo.Friend friend=new UserVo.Friend();
            friend.setAddr("北京"+i);
            friend.setNickname("刘"+i);
            friend.setPhone("image0"+i);

            list.add(friend);
        }

        user.setFriend(list);

        List<UserVo> result=new ArrayList<>();
        result.add(user);

        return result;
    }
}
