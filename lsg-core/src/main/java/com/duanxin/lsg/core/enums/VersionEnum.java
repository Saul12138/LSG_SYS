package com.duanxin.lsg.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author duanxin
 * @version 1.0
 * @className VersionEnum
 * @date 2020/10/08 20:16
 */
@Getter
@AllArgsConstructor
public enum VersionEnum {

    ACCOUNT_SN_VERSION("01");

    private final String versionId;
}
