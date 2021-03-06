package com.duanxin.lsg.api.module;

import lombok.Getter;
import lombok.Setter;

/**
 * @author duanxin
 * @version 1.0
 * @className WXLoginResponse
 * @date 2020/10/06 08:49
 */
@Setter
@Getter
public class WXLoginResponse {

    private String thirdSession;

    private UserInfo userInfo;
}
