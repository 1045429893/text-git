package com.hd.dao.generator;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hd.entity.generator.MlsdMobileProductPresentation;
import com.hd.entity.generator.MlsdMobileProductPresentationExample;
import com.hd.entity.generator.MlsdMobileProductPresentationKey;

/**
*@author Robot
*/
public interface MlsdMobileProductPresentationGeneratorMapper
{

	public Integer countByExample(MlsdMobileProductPresentationExample entity);

    public List<MlsdMobileProductPresentation> selectByExample(MlsdMobileProductPresentationExample entity);

	public MlsdMobileProductPresentation selectByPrimaryKey(MlsdMobileProductPresentationKey key);

	public MlsdMobileProductPresentation selectUnDelByPrimaryKey(MlsdMobileProductPresentationKey key);

    public Integer insertSelective(MlsdMobileProductPresentation entity);

	public Integer replaceSelective(MlsdMobileProductPresentation entity);
 
    public Integer deleteByExample(MlsdMobileProductPresentationExample example);

	public Integer deleteByPrimaryKey(MlsdMobileProductPresentationKey key);

    public Integer updateAllByExample(@Param("record") MlsdMobileProductPresentation entity, @Param("example") MlsdMobileProductPresentationExample example);

	public Integer updateByPrimaryKeySelective(MlsdMobileProductPresentation entity);

}