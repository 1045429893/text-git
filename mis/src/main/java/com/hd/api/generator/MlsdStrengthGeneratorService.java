package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdStrength;
import com.hd.entity.generator.MlsdStrengthExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdStrengthGeneratorService  {
    
	
	public Integer countByExample(MlsdStrengthExample mlsdStrengthExample); 

	
    public List<MlsdStrength> selectByExample(MlsdStrengthExample mlsdStrengthExample); 

				
	public MlsdStrength selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdStrength selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdStrength mlsdStrength); 

	
    public boolean replaceSelective(MlsdStrength mlsdStrength); 

	
    public boolean physicalDeleteByExample(MlsdStrengthExample mlsdStrengthExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdStrength mlsdStrength, MlsdStrengthExample mlsdStrengthExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdStrength mlsdStrength); 
}