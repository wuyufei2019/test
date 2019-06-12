package com.atguigu.ssm_crud.dao;

import com.atguigu.ssm_crud.beans.Job;
import com.atguigu.ssm_crud.beans.JobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    long countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int deleteByPrimaryKey(String jobId);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByExample(JobExample example);

    Job selectByPrimaryKey(String jobId);

    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}