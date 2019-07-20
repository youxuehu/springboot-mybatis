package com.gq.dao.mapper;

import com.gq.dao.model.Userinfos;
import com.gq.dao.model.UserinfosExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinfosMapper {
    int countByExample(UserinfosExample example);

    int deleteByExample(UserinfosExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userinfos record);

    int insertSelective(Userinfos record);

    List<Userinfos> selectByExample(UserinfosExample example);

    Userinfos selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userinfos record, @Param("example") UserinfosExample example);

    int updateByExample(@Param("record") Userinfos record, @Param("example") UserinfosExample example);

    int updateByPrimaryKeySelective(Userinfos record);

    int updateByPrimaryKey(Userinfos record);
}