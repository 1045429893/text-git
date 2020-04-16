package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileItemAdvantage;
import com.hd.entity.generator.MlsdMobileItemAdvantageExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdMobileItemAdvantageGeneratorService  {
    
	
	public Integer countByExample(MlsdMobileItemAdvantageExample mlsdMobileItemAdvantageExample); 

	
    public List<MlsdMobileItemAdvantage> selectByExample(MlsdMobileItemAdvantageExample mlsdMobileItemAdvantageExample); 

				
	public MlsdMobileItemAdvantage selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdMobileItemAdvantage selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdMobileItemAdvantage mlsdMobileItemAdvantage); 

	
    public boolean replaceSelective(MlsdMobileItemAdvantage mlsdMobileItemAdvantage); 

	
    public boolean physicalDeleteByExample(MlsdMobileItemAdvantageExample mlsdMobileItemAdvantageExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdMobileItemAdvantage mlsdMobileItemAdvantage, MlsdMobileItemAdvantageExample mlsdMobileItemAdvantageExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdMobileItemAdvantage mlsdMobileItemAdvantage); 
}