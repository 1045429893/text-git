package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdItemAdvantage;
import com.hd.entity.generator.MlsdItemAdvantageExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdItemAdvantageGeneratorService  {
    
	
	public Integer countByExample(MlsdItemAdvantageExample mlsdItemAdvantageExample); 

	
    public List<MlsdItemAdvantage> selectByExample(MlsdItemAdvantageExample mlsdItemAdvantageExample); 

				
	public MlsdItemAdvantage selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdItemAdvantage selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdItemAdvantage mlsdItemAdvantage); 

	
    public boolean replaceSelective(MlsdItemAdvantage mlsdItemAdvantage); 

	
    public boolean physicalDeleteByExample(MlsdItemAdvantageExample mlsdItemAdvantageExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdItemAdvantage mlsdItemAdvantage, MlsdItemAdvantageExample mlsdItemAdvantageExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdItemAdvantage mlsdItemAdvantage); 
}