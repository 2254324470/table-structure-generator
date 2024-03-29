package com.geqian.structure.service;

import com.geqian.structure.common.dto.ConnectionInfoDto;
import com.geqian.structure.common.ResponseResult;

/**
 * @author geqian
 * @date 12:52 2023/7/9
 */
public interface ConnectionService {

    ResponseResult<String> connection(ConnectionInfoDto dataSourceDto);
}
