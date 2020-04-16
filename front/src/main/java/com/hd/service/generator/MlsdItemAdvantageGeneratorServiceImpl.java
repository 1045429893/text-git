package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdItemAdvantage;
import com.hd.entity.generator.MlsdItemAdvantageExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdItemAdvantageKey;
import com.hd.dao.generator.MlsdItemAdvantageGeneratorMapper;
import com.hd.api.generator.MlsdItemAdvantageGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdItemAdvantageGeneratorServiceImpl implements  MlsdItemAdvantageGeneratorService  {
    	
	@Autowired
	private MlsdItemAdvantageGeneratorMapper mlsdItemAdvantageGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdItemAdvantageExample mlsdItemAdvantageExample) {
		return mlsdItemAdvantageGeneratorMapper.countByExample(mlsdItemAdvantageExample);
	}

	@Override
    public List<MlsdItemAdvantage> selectByExample(MlsdItemAdvantageExample mlsdItemAdvantageExample) {
		return mlsdItemAdvantageGeneratorMapper.selectByExample(mlsdItemAdvantageExample);
	}

	@Override			
	public MlsdItemAdvantage selectByPrimaryKey(BigInteger primaryKey) {
		MlsdItemAdvantageKey mlsdItemAdvantageKey = new MlsdItemAdvantageKey();
		mlsdItemAdvantageKey.setId(primaryKey);
		return mlsdItemAdvantageGeneratorMapper.selectByPrimaryKey(mlsdItemAdvantageKey);
	}	

	@Override
	public MlsdItemAdvantage selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdItemAdvantageKey mlsdItemAdvantageKey = new MlsdItemAdvantageKey();
		mlsdItemAdvantageKey.setId(primaryKey);
		return mlsdItemAdvantageGeneratorMapper.selectUnDelByPrimaryKey(mlsdItemAdvantageKey);
	}

	@Override
    public boolean insertSelective(MlsdItemAdvantage mlsdItemAdvantage) {
	   return mlsdItemAdvantageGeneratorMapper.insertSelective(mlsdItemAdvantage)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdItemAdvantage mlsdItemAdvantage) {
	   return mlsdItemAdvantageGeneratorMapper.replaceSelective(mlsdItemAdvantage)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdItemAdvantageExample mlsdItemAdvantageExample) {
	   return mlsdItemAdvantageGeneratorMapper.deleteByExample(mlsdItemAdvantageExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdItemAdvantageKey mlsdItemAdvantageKey = new MlsdItemAdvantageKey();
		mlsdItemAdvantageKey.setId(primaryKey);
	   return mlsdItemAdvantageGeneratorMapper.deleteByPrimaryKey(mlsdItemAdvantageKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdItemAdvantage mlsdItemAdvantage, MlsdItemAdvantageExample mlsdItemAdvantageExample) {
		return mlsdItemAdvantageGeneratorMapper.updateAllByExample(mlsdItemAdvantage,mlsdItemAdvantageExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdItemAdvantage mlsdItemAdvantage) {
		return mlsdItemAdvantageGeneratorMapper.updateByPrimaryKeySelective(mlsdItemAdvantage)> 0 ? true : false;
	}
}