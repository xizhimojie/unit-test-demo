package org.learnjava.dq.biz.manager;

import org.learnjava.dq.biz.domain.UserInfo;

import java.util.List;

public interface UserInfoManager {

    Boolean saveUserInfo(UserInfo userInfo);

    Boolean updateUserInfo(UserInfo userInfo);

    UserInfo getUserInfoByUserId(Long userId);

    UserInfo getUserInfoByMobile(String mobile);

    List<UserInfo> listUserInfoByUserIds(List<Long> userIds);

    Boolean removeUserInfoByUserId(Long userId);
}
