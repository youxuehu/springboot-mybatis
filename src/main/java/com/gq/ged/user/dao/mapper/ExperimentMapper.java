package com.gq.ged.user.dao.mapper;

import com.gq.ged.user.dao.model.Experiment;
import com.gq.ged.user.dao.model.ExperimentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExperimentMapper {
    int countByExample(ExperimentExample example);

    int deleteByExample(ExperimentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Experiment record);

    int insertSelective(Experiment record);

    List<Experiment> selectByExampleWithBLOBs(ExperimentExample example);

    List<Experiment> selectByExample(ExperimentExample example);

    Experiment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Experiment record, @Param("example") ExperimentExample example);

    int updateByExampleWithBLOBs(@Param("record") Experiment record, @Param("example") ExperimentExample example);

    int updateByExample(@Param("record") Experiment record, @Param("example") ExperimentExample example);

    int updateByPrimaryKeySelective(Experiment record);

    int updateByPrimaryKeyWithBLOBs(Experiment record);

    int updateByPrimaryKey(Experiment record);
}