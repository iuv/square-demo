package com.jisuye.mapper;

import com.jisuye.entity.AbcEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 测试mapper
 */
@Mapper
public interface AbcMapper {
    List<AbcEntity> selectAbc(int id);
}
