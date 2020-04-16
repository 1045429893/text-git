package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileStrength;
import com.hd.entity.generator.MlsdMobileStrengthExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdMobileStrengthGeneratorService  {
    
	
	public Integer countByExample(MlsdMobileStrengthExample mlsdMobileStrengthExample); 

	
    public List<MlsdMobileStrength> selectByExample(MlsdMobileStrengthExample mlsdMobileStrengthExample); 

				
	public MlsdMobileStrength selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdMobileStrength selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdMobileStrength mlsdMobileStrength); 

	
    public boolean replaceSelective(MlsdMobileStrength mlsdMobileStrength); 

	
    public boolean physicalDeleteByExample(MlsdMobileStrengthExample mlsdMobileStrengthExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdMobileStrength mlsdMobileStrength, MlsdMobileStrengthExample mlsdMobileStrengthExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdMobileStrength mlsdMobileStrength); 
}