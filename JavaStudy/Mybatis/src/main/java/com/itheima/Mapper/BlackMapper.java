package com.itheima.Mapper;

import com.itheima.pojo.BlackList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wangchen
 */
@Mapper
public interface BlackMapper {

    List<BlackList> selectBlack();
}
