package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdStrength;
import com.hd.entity.generator.MlsdStrengthExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdStrengthKey;
import com.hd.dao.generator.MlsdStrengthGeneratorMapper;
import com.hd.api.generator.MlsdStrengthGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdStrengthGeneratorServiceImpl implements  MlsdStrengthGeneratorService  {
    	
	@Autowired
	private MlsdStrengthGeneratorMapper mlsdStrengthGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdStrengthExample mlsdStrengthExample) {
		return mlsdStrengthGeneratorMapper.countByExample(mlsdStrengthExample);
	}

	@Override
    public List<MlsdStrength> selectByExample(MlsdStrengthExample mlsdStrengthExample) {
		return mlsdStrengthGeneratorMapper.selectByExample(mlsdStrengthExample);
	}

	@Override			
	public MlsdStrength selectByPrimaryKey(BigInteger primaryKey) {
		MlsdStrengthKey mlsdStrengthKey = new MlsdStrengthKey();
		mlsdStrengthKey.setId(primaryKey);
		return mlsdStrengthGeneratorMapper.selectByPrimaryKey(mlsdStrengthKey);
	}	

	@Override
	public MlsdStrength selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdStrengthKey mlsdStrengthKey = new MlsdStrengthKey();
		mlsdStrengthKey.setId(primaryKey);
		return mlsdStrengthGeneratorMapper.selectUnDelByPrimaryKey(mlsdStrengthKey);
	}

	@Override
    public boolean insertSelective(MlsdStrength mlsdStrength) {
	   return mlsdStrengthGeneratorMapper.insertSelective(mlsdStrength)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdStrength mlsdStrength) {
	   return mlsdStrengthGeneratorMapper.replaceSelective(mlsdStrength)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdStrengthExample mlsdStrengthExample) {
	   return mlsdStrengthGeneratorMapper.deleteByExample(mlsdStrengthExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdStrengthKey mlsdStrengthKey = new MlsdStrengthKey();
		mlsdStrengthKey.setId(primaryKey);
	   return mlsdStrengthGeneratorMapper.deleteByPrimaryKey(mlsdStrengthKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdStrength mlsdStrength, MlsdStrengthExample mlsdStrengthExample) {
		return mlsdStrengthGeneratorMapper.updateAllByExample(mlsdStrength,mlsdStrengthExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdStrength mlsdStrength) {
		return mlsdStrengthGeneratorMapper.updateByPrimaryKeySelective(mlsdStrength)> 0 ? true : false;
	}
}