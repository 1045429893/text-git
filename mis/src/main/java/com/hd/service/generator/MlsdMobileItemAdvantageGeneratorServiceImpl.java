package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileItemAdvantage;
import com.hd.entity.generator.MlsdMobileItemAdvantageExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdMobileItemAdvantageKey;
import com.hd.dao.generator.MlsdMobileItemAdvantageGeneratorMapper;
import com.hd.api.generator.MlsdMobileItemAdvantageGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdMobileItemAdvantageGeneratorServiceImpl implements  MlsdMobileItemAdvantageGeneratorService  {
    	
	@Autowired
	private MlsdMobileItemAdvantageGeneratorMapper mlsdMobileItemAdvantageGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdMobileItemAdvantageExample mlsdMobileItemAdvantageExample) {
		return mlsdMobileItemAdvantageGeneratorMapper.countByExample(mlsdMobileItemAdvantageExample);
	}

	@Override
    public List<MlsdMobileItemAdvantage> selectByExample(MlsdMobileItemAdvantageExample mlsdMobileItemAdvantageExample) {
		return mlsdMobileItemAdvantageGeneratorMapper.selectByExample(mlsdMobileItemAdvantageExample);
	}

	@Override			
	public MlsdMobileItemAdvantage selectByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileItemAdvantageKey mlsdMobileItemAdvantageKey = new MlsdMobileItemAdvantageKey();
		mlsdMobileItemAdvantageKey.setId(primaryKey);
		return mlsdMobileItemAdvantageGeneratorMapper.selectByPrimaryKey(mlsdMobileItemAdvantageKey);
	}	

	@Override
	public MlsdMobileItemAdvantage selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileItemAdvantageKey mlsdMobileItemAdvantageKey = new MlsdMobileItemAdvantageKey();
		mlsdMobileItemAdvantageKey.setId(primaryKey);
		return mlsdMobileItemAdvantageGeneratorMapper.selectUnDelByPrimaryKey(mlsdMobileItemAdvantageKey);
	}

	@Override
    public boolean insertSelective(MlsdMobileItemAdvantage mlsdMobileItemAdvantage) {
	   return mlsdMobileItemAdvantageGeneratorMapper.insertSelective(mlsdMobileItemAdvantage)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdMobileItemAdvantage mlsdMobileItemAdvantage) {
	   return mlsdMobileItemAdvantageGeneratorMapper.replaceSelective(mlsdMobileItemAdvantage)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdMobileItemAdvantageExample mlsdMobileItemAdvantageExample) {
	   return mlsdMobileItemAdvantageGeneratorMapper.deleteByExample(mlsdMobileItemAdvantageExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileItemAdvantageKey mlsdMobileItemAdvantageKey = new MlsdMobileItemAdvantageKey();
		mlsdMobileItemAdvantageKey.setId(primaryKey);
	   return mlsdMobileItemAdvantageGeneratorMapper.deleteByPrimaryKey(mlsdMobileItemAdvantageKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdMobileItemAdvantage mlsdMobileItemAdvantage, MlsdMobileItemAdvantageExample mlsdMobileItemAdvantageExample) {
		return mlsdMobileItemAdvantageGeneratorMapper.updateAllByExample(mlsdMobileItemAdvantage,mlsdMobileItemAdvantageExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdMobileItemAdvantage mlsdMobileItemAdvantage) {
		return mlsdMobileItemAdvantageGeneratorMapper.updateByPrimaryKeySelective(mlsdMobileItemAdvantage)> 0 ? true : false;
	}
}