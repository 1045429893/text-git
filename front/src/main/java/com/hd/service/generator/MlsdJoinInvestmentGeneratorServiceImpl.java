package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdJoinInvestment;
import com.hd.entity.generator.MlsdJoinInvestmentExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdJoinInvestmentKey;
import com.hd.dao.generator.MlsdJoinInvestmentGeneratorMapper;
import com.hd.api.generator.MlsdJoinInvestmentGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdJoinInvestmentGeneratorServiceImpl implements  MlsdJoinInvestmentGeneratorService  {
    	
	@Autowired
	private MlsdJoinInvestmentGeneratorMapper mlsdJoinInvestmentGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdJoinInvestmentExample mlsdJoinInvestmentExample) {
		return mlsdJoinInvestmentGeneratorMapper.countByExample(mlsdJoinInvestmentExample);
	}

	@Override
    public List<MlsdJoinInvestment> selectByExample(MlsdJoinInvestmentExample mlsdJoinInvestmentExample) {
		return mlsdJoinInvestmentGeneratorMapper.selectByExample(mlsdJoinInvestmentExample);
	}

	@Override			
	public MlsdJoinInvestment selectByPrimaryKey(BigInteger primaryKey) {
		MlsdJoinInvestmentKey mlsdJoinInvestmentKey = new MlsdJoinInvestmentKey();
		mlsdJoinInvestmentKey.setId(primaryKey);
		return mlsdJoinInvestmentGeneratorMapper.selectByPrimaryKey(mlsdJoinInvestmentKey);
	}	

	@Override
	public MlsdJoinInvestment selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdJoinInvestmentKey mlsdJoinInvestmentKey = new MlsdJoinInvestmentKey();
		mlsdJoinInvestmentKey.setId(primaryKey);
		return mlsdJoinInvestmentGeneratorMapper.selectUnDelByPrimaryKey(mlsdJoinInvestmentKey);
	}

	@Override
    public boolean insertSelective(MlsdJoinInvestment mlsdJoinInvestment) {
	   return mlsdJoinInvestmentGeneratorMapper.insertSelective(mlsdJoinInvestment)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdJoinInvestment mlsdJoinInvestment) {
	   return mlsdJoinInvestmentGeneratorMapper.replaceSelective(mlsdJoinInvestment)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdJoinInvestmentExample mlsdJoinInvestmentExample) {
	   return mlsdJoinInvestmentGeneratorMapper.deleteByExample(mlsdJoinInvestmentExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdJoinInvestmentKey mlsdJoinInvestmentKey = new MlsdJoinInvestmentKey();
		mlsdJoinInvestmentKey.setId(primaryKey);
	   return mlsdJoinInvestmentGeneratorMapper.deleteByPrimaryKey(mlsdJoinInvestmentKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdJoinInvestment mlsdJoinInvestment, MlsdJoinInvestmentExample mlsdJoinInvestmentExample) {
		return mlsdJoinInvestmentGeneratorMapper.updateAllByExample(mlsdJoinInvestment,mlsdJoinInvestmentExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdJoinInvestment mlsdJoinInvestment) {
		return mlsdJoinInvestmentGeneratorMapper.updateByPrimaryKeySelective(mlsdJoinInvestment)> 0 ? true : false;
	}
}