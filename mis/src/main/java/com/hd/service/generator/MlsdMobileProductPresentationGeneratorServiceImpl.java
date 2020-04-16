package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileProductPresentation;
import com.hd.entity.generator.MlsdMobileProductPresentationExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdMobileProductPresentationKey;
import com.hd.dao.generator.MlsdMobileProductPresentationGeneratorMapper;
import com.hd.api.generator.MlsdMobileProductPresentationGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdMobileProductPresentationGeneratorServiceImpl implements  MlsdMobileProductPresentationGeneratorService  {
    	
	@Autowired
	private MlsdMobileProductPresentationGeneratorMapper mlsdMobileProductPresentationGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdMobileProductPresentationExample mlsdMobileProductPresentationExample) {
		return mlsdMobileProductPresentationGeneratorMapper.countByExample(mlsdMobileProductPresentationExample);
	}

	@Override
    public List<MlsdMobileProductPresentation> selectByExample(MlsdMobileProductPresentationExample mlsdMobileProductPresentationExample) {
		return mlsdMobileProductPresentationGeneratorMapper.selectByExample(mlsdMobileProductPresentationExample);
	}

	@Override			
	public MlsdMobileProductPresentation selectByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileProductPresentationKey mlsdMobileProductPresentationKey = new MlsdMobileProductPresentationKey();
		mlsdMobileProductPresentationKey.setId(primaryKey);
		return mlsdMobileProductPresentationGeneratorMapper.selectByPrimaryKey(mlsdMobileProductPresentationKey);
	}	

	@Override
	public MlsdMobileProductPresentation selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileProductPresentationKey mlsdMobileProductPresentationKey = new MlsdMobileProductPresentationKey();
		mlsdMobileProductPresentationKey.setId(primaryKey);
		return mlsdMobileProductPresentationGeneratorMapper.selectUnDelByPrimaryKey(mlsdMobileProductPresentationKey);
	}

	@Override
    public boolean insertSelective(MlsdMobileProductPresentation mlsdMobileProductPresentation) {
	   return mlsdMobileProductPresentationGeneratorMapper.insertSelective(mlsdMobileProductPresentation)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdMobileProductPresentation mlsdMobileProductPresentation) {
	   return mlsdMobileProductPresentationGeneratorMapper.replaceSelective(mlsdMobileProductPresentation)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdMobileProductPresentationExample mlsdMobileProductPresentationExample) {
	   return mlsdMobileProductPresentationGeneratorMapper.deleteByExample(mlsdMobileProductPresentationExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileProductPresentationKey mlsdMobileProductPresentationKey = new MlsdMobileProductPresentationKey();
		mlsdMobileProductPresentationKey.setId(primaryKey);
	   return mlsdMobileProductPresentationGeneratorMapper.deleteByPrimaryKey(mlsdMobileProductPresentationKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdMobileProductPresentation mlsdMobileProductPresentation, MlsdMobileProductPresentationExample mlsdMobileProductPresentationExample) {
		return mlsdMobileProductPresentationGeneratorMapper.updateAllByExample(mlsdMobileProductPresentation,mlsdMobileProductPresentationExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdMobileProductPresentation mlsdMobileProductPresentation) {
		return mlsdMobileProductPresentationGeneratorMapper.updateByPrimaryKeySelective(mlsdMobileProductPresentation)> 0 ? true : false;
	}
}