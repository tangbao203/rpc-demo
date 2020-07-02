package com.lks.platform.sdk.vo;

import lombok.Data;

import java.util.List;

@Data
public class UserVo {
    private String name;
    private String gender;
    private String agent;
    private String addr;

    private List<Friend> friend;

    @Data
    public static class Friend{
        private String nickname;
        private String photo;
        private String phone;
        private String addr;
    }

}
