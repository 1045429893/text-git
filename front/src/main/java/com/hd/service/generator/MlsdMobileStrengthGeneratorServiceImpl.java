package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileStrength;
import com.hd.entity.generator.MlsdMobileStrengthExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdMobileStrengthKey;
import com.hd.dao.generator.MlsdMobileStrengthGeneratorMapper;
import com.hd.api.generator.MlsdMobileStrengthGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdMobileStrengthGeneratorServiceImpl implements  MlsdMobileStrengthGeneratorService  {
    	
	@Autowired
	private MlsdMobileStrengthGeneratorMapper mlsdMobileStrengthGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdMobileStrengthExample mlsdMobileStrengthExample) {
		return mlsdMobileStrengthGeneratorMapper.countByExample(mlsdMobileStrengthExample);
	}

	@Override
    public List<MlsdMobileStrength> selectByExample(MlsdMobileStrengthExample mlsdMobileStrengthExample) {
		return mlsdMobileStrengthGeneratorMapper.selectByExample(mlsdMobileStrengthExample);
	}

	@Override			
	public MlsdMobileStrength selectByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileStrengthKey mlsdMobileStrengthKey = new MlsdMobileStrengthKey();
		mlsdMobileStrengthKey.setId(primaryKey);
		return mlsdMobileStrengthGeneratorMapper.selectByPrimaryKey(mlsdMobileStrengthKey);
	}	

	@Override
	public MlsdMobileStrength selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileStrengthKey mlsdMobileStrengthKey = new MlsdMobileStrengthKey();
		mlsdMobileStrengthKey.setId(primaryKey);
		return mlsdMobileStrengthGeneratorMapper.selectUnDelByPrimaryKey(mlsdMobileStrengthKey);
	}

	@Override
    public boolean insertSelective(MlsdMobileStrength mlsdMobileStrength) {
	   return mlsdMobileStrengthGeneratorMapper.insertSelective(mlsdMobileStrength)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdMobileStrength mlsdMobileStrength) {
	   return mlsdMobileStrengthGeneratorMapper.replaceSelective(mlsdMobileStrength)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdMobileStrengthExample mlsdMobileStrengthExample) {
	   return mlsdMobileStrengthGeneratorMapper.deleteByExample(mlsdMobileStrengthExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileStrengthKey mlsdMobileStrengthKey = new MlsdMobileStrengthKey();
		mlsdMobileStrengthKey.setId(primaryKey);
	   return mlsdMobileStrengthGeneratorMapper.deleteByPrimaryKey(mlsdMobileStrengthKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdMobileStrength mlsdMobileStrength, MlsdMobileStrengthExample mlsdMobileStrengthExample) {
		return mlsdMobileStrengthGeneratorMapper.updateAllByExample(mlsdMobileStrength,mlsdMobileStrengthExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdMobileStrength mlsdMobileStrength) {
		return mlsdMobileStrengthGeneratorMapper.updateByPrimaryKeySelective(mlsdMobileStrength)> 0 ? true : false;
	}
}