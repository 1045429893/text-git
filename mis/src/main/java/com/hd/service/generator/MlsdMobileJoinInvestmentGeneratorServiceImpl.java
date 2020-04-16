package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileJoinInvestment;
import com.hd.entity.generator.MlsdMobileJoinInvestmentExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdMobileJoinInvestmentKey;
import com.hd.dao.generator.MlsdMobileJoinInvestmentGeneratorMapper;
import com.hd.api.generator.MlsdMobileJoinInvestmentGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdMobileJoinInvestmentGeneratorServiceImpl implements  MlsdMobileJoinInvestmentGeneratorService  {
    	
	@Autowired
	private MlsdMobileJoinInvestmentGeneratorMapper mlsdMobileJoinInvestmentGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdMobileJoinInvestmentExample mlsdMobileJoinInvestmentExample) {
		return mlsdMobileJoinInvestmentGeneratorMapper.countByExample(mlsdMobileJoinInvestmentExample);
	}

	@Override
    public List<MlsdMobileJoinInvestment> selectByExample(MlsdMobileJoinInvestmentExample mlsdMobileJoinInvestmentExample) {
		return mlsdMobileJoinInvestmentGeneratorMapper.selectByExample(mlsdMobileJoinInvestmentExample);
	}

	@Override			
	public MlsdMobileJoinInvestment selectByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileJoinInvestmentKey mlsdMobileJoinInvestmentKey = new MlsdMobileJoinInvestmentKey();
		mlsdMobileJoinInvestmentKey.setId(primaryKey);
		return mlsdMobileJoinInvestmentGeneratorMapper.selectByPrimaryKey(mlsdMobileJoinInvestmentKey);
	}	

	@Override
	public MlsdMobileJoinInvestment selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileJoinInvestmentKey mlsdMobileJoinInvestmentKey = new MlsdMobileJoinInvestmentKey();
		mlsdMobileJoinInvestmentKey.setId(primaryKey);
		return mlsdMobileJoinInvestmentGeneratorMapper.selectUnDelByPrimaryKey(mlsdMobileJoinInvestmentKey);
	}

	@Override
    public boolean insertSelective(MlsdMobileJoinInvestment mlsdMobileJoinInvestment) {
	   return mlsdMobileJoinInvestmentGeneratorMapper.insertSelective(mlsdMobileJoinInvestment)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdMobileJoinInvestment mlsdMobileJoinInvestment) {
	   return mlsdMobileJoinInvestmentGeneratorMapper.replaceSelective(mlsdMobileJoinInvestment)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdMobileJoinInvestmentExample mlsdMobileJoinInvestmentExample) {
	   return mlsdMobileJoinInvestmentGeneratorMapper.deleteByExample(mlsdMobileJoinInvestmentExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileJoinInvestmentKey mlsdMobileJoinInvestmentKey = new MlsdMobileJoinInvestmentKey();
		mlsdMobileJoinInvestmentKey.setId(primaryKey);
	   return mlsdMobileJoinInvestmentGeneratorMapper.deleteByPrimaryKey(mlsdMobileJoinInvestmentKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdMobileJoinInvestment mlsdMobileJoinInvestment, MlsdMobileJoinInvestmentExample mlsdMobileJoinInvestmentExample) {
		return mlsdMobileJoinInvestmentGeneratorMapper.updateAllByExample(mlsdMobileJoinInvestment,mlsdMobileJoinInvestmentExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdMobileJoinInvestment mlsdMobileJoinInvestment) {
		return mlsdMobileJoinInvestmentGeneratorMapper.updateByPrimaryKeySelective(mlsdMobileJoinInvestment)> 0 ? true : false;
	}
}