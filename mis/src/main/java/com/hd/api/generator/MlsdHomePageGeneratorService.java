package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdHomePageExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdHomePageGeneratorService  {
    
	
	public Integer countByExample(MlsdHomePageExample mlsdHomePageExample); 

	
    public List<MlsdHomePage> selectByExample(MlsdHomePageExample mlsdHomePageExample); 

				
	public MlsdHomePage selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdHomePage selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdHomePage mlsdHomePage); 

	
    public boolean replaceSelective(MlsdHomePage mlsdHomePage); 

	
    public boolean physicalDeleteByExample(MlsdHomePageExample mlsdHomePageExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdHomePage mlsdHomePage, MlsdHomePageExample mlsdHomePageExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdHomePage mlsdHomePage); 
}