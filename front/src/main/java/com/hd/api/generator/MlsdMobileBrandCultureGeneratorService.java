package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileBrandCulture;
import com.hd.entity.generator.MlsdMobileBrandCultureExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdMobileBrandCultureGeneratorService  {
    
	
	public Integer countByExample(MlsdMobileBrandCultureExample mlsdMobileBrandCultureExample); 

	
    public List<MlsdMobileBrandCulture> selectByExample(MlsdMobileBrandCultureExample mlsdMobileBrandCultureExample); 

				
	public MlsdMobileBrandCulture selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdMobileBrandCulture selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdMobileBrandCulture mlsdMobileBrandCulture); 

	
    public boolean replaceSelective(MlsdMobileBrandCulture mlsdMobileBrandCulture); 

	
    public boolean physicalDeleteByExample(MlsdMobileBrandCultureExample mlsdMobileBrandCultureExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdMobileBrandCulture mlsdMobileBrandCulture, MlsdMobileBrandCultureExample mlsdMobileBrandCultureExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdMobileBrandCulture mlsdMobileBrandCulture); 
}