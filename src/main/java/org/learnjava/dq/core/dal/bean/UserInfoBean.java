package org.learnjava.dq.core.dal.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoBean {

    private Long id;
    private Long userId;
    private String nickname;
    private String mobile;
    private Integer sex;
    private Date updateTime;
    private Date createTime;
}
