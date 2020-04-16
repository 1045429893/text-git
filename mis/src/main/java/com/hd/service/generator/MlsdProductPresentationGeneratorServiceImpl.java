package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdProductPresentation;
import com.hd.entity.generator.MlsdProductPresentationExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdProductPresentationKey;
import com.hd.dao.generator.MlsdProductPresentationGeneratorMapper;
import com.hd.api.generator.MlsdProductPresentationGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdProductPresentationGeneratorServiceImpl implements  MlsdProductPresentationGeneratorService  {
    	
	@Autowired
	private MlsdProductPresentationGeneratorMapper mlsdProductPresentationGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdProductPresentationExample mlsdProductPresentationExample) {
		return mlsdProductPresentationGeneratorMapper.countByExample(mlsdProductPresentationExample);
	}

	@Override
    public List<MlsdProductPresentation> selectByExample(MlsdProductPresentationExample mlsdProductPresentationExample) {
		return mlsdProductPresentationGeneratorMapper.selectByExample(mlsdProductPresentationExample);
	}

	@Override			
	public MlsdProductPresentation selectByPrimaryKey(BigInteger primaryKey) {
		MlsdProductPresentationKey mlsdProductPresentationKey = new MlsdProductPresentationKey();
		mlsdProductPresentationKey.setId(primaryKey);
		return mlsdProductPresentationGeneratorMapper.selectByPrimaryKey(mlsdProductPresentationKey);
	}	

	@Override
	public MlsdProductPresentation selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdProductPresentationKey mlsdProductPresentationKey = new MlsdProductPresentationKey();
		mlsdProductPresentationKey.setId(primaryKey);
		return mlsdProductPresentationGeneratorMapper.selectUnDelByPrimaryKey(mlsdProductPresentationKey);
	}

	@Override
    public boolean insertSelective(MlsdProductPresentation mlsdProductPresentation) {
	   return mlsdProductPresentationGeneratorMapper.insertSelective(mlsdProductPresentation)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdProductPresentation mlsdProductPresentation) {
	   return mlsdProductPresentationGeneratorMapper.replaceSelective(mlsdProductPresentation)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdProductPresentationExample mlsdProductPresentationExample) {
	   return mlsdProductPresentationGeneratorMapper.deleteByExample(mlsdProductPresentationExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdProductPresentationKey mlsdProductPresentationKey = new MlsdProductPresentationKey();
		mlsdProductPresentationKey.setId(primaryKey);
	   return mlsdProductPresentationGeneratorMapper.deleteByPrimaryKey(mlsdProductPresentationKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdProductPresentation mlsdProductPresentation, MlsdProductPresentationExample mlsdProductPresentationExample) {
		return mlsdProductPresentationGeneratorMapper.updateAllByExample(mlsdProductPresentation,mlsdProductPresentationExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdProductPresentation mlsdProductPresentation) {
		return mlsdProductPresentationGeneratorMapper.updateByPrimaryKeySelective(mlsdProductPresentation)> 0 ? true : false;
	}
}