package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileHomePage;
import com.hd.entity.generator.MlsdMobileHomePageExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdMobileHomePageGeneratorService  {
    
	
	public Integer countByExample(MlsdMobileHomePageExample mlsdMobileHomePageExample); 

	
    public List<MlsdMobileHomePage> selectByExample(MlsdMobileHomePageExample mlsdMobileHomePageExample); 

				
	public MlsdMobileHomePage selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdMobileHomePage selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdMobileHomePage mlsdMobileHomePage); 

	
    public boolean replaceSelective(MlsdMobileHomePage mlsdMobileHomePage); 

	
    public boolean physicalDeleteByExample(MlsdMobileHomePageExample mlsdMobileHomePageExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdMobileHomePage mlsdMobileHomePage, MlsdMobileHomePageExample mlsdMobileHomePageExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdMobileHomePage mlsdMobileHomePage); 
}