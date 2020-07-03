package com.lks.platform.sdk;

import com.lks.platform.sdk.vo.QueryVo;
import com.lks.platform.sdk.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="test",url="${rpc.producer}")
@RequestMapping("/test")
public interface ITestService {
    @PostMapping("/getUserList1")
    List<UserVo> getUserList1(@RequestParam("userId") String userId, @RequestBody @RequestParam("query1") QueryVo query1,@RequestBody @RequestParam("query2") QueryVo query2);

    @PostMapping("/getUserList2")
    List<UserVo<UserVo.Friend>> getUserList2(@RequestParam("userId") String userId, @RequestBody QueryVo query1);
}
