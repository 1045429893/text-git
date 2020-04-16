package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdProductPresentation;
import com.hd.entity.generator.MlsdProductPresentationExample;
import com.hd.entity.generator.MlsdProductPresentationKey;

/**
*@author Robot
*/
public interface MlsdProductPresentationGeneratorMapper
{

	public Integer countByExample(MlsdProductPresentationExample entity);

    public List<MlsdProductPresentation> selectByExample(MlsdProductPresentationExample entity);

	public MlsdProductPresentation selectByPrimaryKey(MlsdProductPresentationKey key);

	public MlsdProductPresentation selectUnDelByPrimaryKey(MlsdProductPresentationKey key);

    public Integer insertSelective(MlsdProductPresentation entity);

	public Integer replaceSelective(MlsdProductPresentation entity);
 
    public Integer deleteByExample(MlsdProductPresentationExample example);

	public Integer deleteByPrimaryKey(MlsdProductPresentationKey key);

    public Integer updateAllByExample(@Param("record") MlsdProductPresentation entity, @Param("example") MlsdProductPresentationExample example);

	public Integer updateByPrimaryKeySelective(MlsdProductPresentation entity);

}