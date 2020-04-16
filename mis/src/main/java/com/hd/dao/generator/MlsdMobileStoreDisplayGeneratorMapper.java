package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdMobileStoreDisplay;
import com.hd.entity.generator.MlsdMobileStoreDisplayExample;
import com.hd.entity.generator.MlsdMobileStoreDisplayKey;

/**
*@author Robot
*/
public interface MlsdMobileStoreDisplayGeneratorMapper
{

	public Integer countByExample(MlsdMobileStoreDisplayExample entity);

    public List<MlsdMobileStoreDisplay> selectByExample(MlsdMobileStoreDisplayExample entity);

	public MlsdMobileStoreDisplay selectByPrimaryKey(MlsdMobileStoreDisplayKey key);

	public MlsdMobileStoreDisplay selectUnDelByPrimaryKey(MlsdMobileStoreDisplayKey key);

    public Integer insertSelective(MlsdMobileStoreDisplay entity);

	public Integer replaceSelective(MlsdMobileStoreDisplay entity);
 
    public Integer deleteByExample(MlsdMobileStoreDisplayExample example);

	public Integer deleteByPrimaryKey(MlsdMobileStoreDisplayKey key);

    public Integer updateAllByExample(@Param("record") MlsdMobileStoreDisplay entity, @Param("example") MlsdMobileStoreDisplayExample example);

	public Integer updateByPrimaryKeySelective(MlsdMobileStoreDisplay entity);

}