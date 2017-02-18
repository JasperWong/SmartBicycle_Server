package com.jasper.ssm.mapper;

import com.jasper.ssm.pojo.Bicycle;
import com.jasper.ssm.pojo.Trash;

/**
 * Created by 76645 on 2017-02-17.
 */
public interface TrashMapper {

    int updateTrash(Trash trash);
    Trash selectById1(Integer id);
}
