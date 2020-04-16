package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileJoinInvestment;
import com.hd.entity.generator.MlsdMobileJoinInvestmentExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdMobileJoinInvestmentGeneratorService  {
    
	
	public Integer countByExample(MlsdMobileJoinInvestmentExample mlsdMobileJoinInvestmentExample); 

	
    public List<MlsdMobileJoinInvestment> selectByExample(MlsdMobileJoinInvestmentExample mlsdMobileJoinInvestmentExample); 

				
	public MlsdMobileJoinInvestment selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdMobileJoinInvestment selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdMobileJoinInvestment mlsdMobileJoinInvestment); 

	
    public boolean replaceSelective(MlsdMobileJoinInvestment mlsdMobileJoinInvestment); 

	
    public boolean physicalDeleteByExample(MlsdMobileJoinInvestmentExample mlsdMobileJoinInvestmentExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdMobileJoinInvestment mlsdMobileJoinInvestment, MlsdMobileJoinInvestmentExample mlsdMobileJoinInvestmentExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdMobileJoinInvestment mlsdMobileJoinInvestment); 
}