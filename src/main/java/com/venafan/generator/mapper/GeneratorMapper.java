package com.venafan.generator.mapper;

import java.util.List;
import java.util.Map;

/**
 * @author yanghang
 * @version V1.0
 * Created in 2020-05-01 10:26
 */
public interface GeneratorMapper {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);
}
