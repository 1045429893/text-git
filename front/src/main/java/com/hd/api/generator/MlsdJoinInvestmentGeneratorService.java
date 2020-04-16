package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdJoinInvestment;
import com.hd.entity.generator.MlsdJoinInvestmentExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdJoinInvestmentGeneratorService  {
    
	
	public Integer countByExample(MlsdJoinInvestmentExample mlsdJoinInvestmentExample); 

	
    public List<MlsdJoinInvestment> selectByExample(MlsdJoinInvestmentExample mlsdJoinInvestmentExample); 

				
	public MlsdJoinInvestment selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdJoinInvestment selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdJoinInvestment mlsdJoinInvestment); 

	
    public boolean replaceSelective(MlsdJoinInvestment mlsdJoinInvestment); 

	
    public boolean physicalDeleteByExample(MlsdJoinInvestmentExample mlsdJoinInvestmentExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdJoinInvestment mlsdJoinInvestment, MlsdJoinInvestmentExample mlsdJoinInvestmentExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdJoinInvestment mlsdJoinInvestment); 
}