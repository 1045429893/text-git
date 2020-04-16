package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdBrandCulture;
import com.hd.entity.generator.MlsdBrandCultureExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdBrandCultureGeneratorService  {
    
	
	public Integer countByExample(MlsdBrandCultureExample mlsdBrandCultureExample); 

	
    public List<MlsdBrandCulture> selectByExample(MlsdBrandCultureExample mlsdBrandCultureExample); 

				
	public MlsdBrandCulture selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdBrandCulture selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdBrandCulture mlsdBrandCulture); 

	
    public boolean replaceSelective(MlsdBrandCulture mlsdBrandCulture); 

	
    public boolean physicalDeleteByExample(MlsdBrandCultureExample mlsdBrandCultureExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdBrandCulture mlsdBrandCulture, MlsdBrandCultureExample mlsdBrandCultureExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdBrandCulture mlsdBrandCulture); 
}