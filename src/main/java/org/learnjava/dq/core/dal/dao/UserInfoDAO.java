package org.learnjava.dq.core.dal.dao;

import org.apache.ibatis.annotations.Param;
import org.learnjava.dq.core.dal.bean.UserInfoBean;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserInfoDAO {

    int saveUserInfoBean(UserInfoBean userInfoBean);

    int updateUserInfoBean(UserInfoBean userInfoBean);

    UserInfoBean getUserInfoBeanByUserId(@Param("userId") Long userId);

    UserInfoBean getUserInfoBeanByMobile(@Param("mobile") String mobile);

    List<UserInfoBean> listUserInfoBeanByUserIds(@Param("userIds") List<Long> userIds);

    int removeUserInfoBeanByUserId(@Param("userId") Long userId);
}
