package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdStoreDisplay;
import com.hd.entity.generator.MlsdStoreDisplayExample;
import com.hd.entity.generator.MlsdStoreDisplayKey;

/**
*@author Robot
*/
public interface MlsdStoreDisplayGeneratorMapper
{

	public Integer countByExample(MlsdStoreDisplayExample entity);

    public List<MlsdStoreDisplay> selectByExample(MlsdStoreDisplayExample entity);

	public MlsdStoreDisplay selectByPrimaryKey(MlsdStoreDisplayKey key);

	public MlsdStoreDisplay selectUnDelByPrimaryKey(MlsdStoreDisplayKey key);

    public Integer insertSelective(MlsdStoreDisplay entity);

	public Integer replaceSelective(MlsdStoreDisplay entity);
 
    public Integer deleteByExample(MlsdStoreDisplayExample example);

	public Integer deleteByPrimaryKey(MlsdStoreDisplayKey key);

    public Integer updateAllByExample(@Param("record") MlsdStoreDisplay entity, @Param("example") MlsdStoreDisplayExample example);

	public Integer updateByPrimaryKeySelective(MlsdStoreDisplay entity);

}