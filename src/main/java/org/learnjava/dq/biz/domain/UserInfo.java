package org.learnjava.dq.biz.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    private Long userId;
    private String nickname;
    private String mobile;
    private Integer sex;
}
