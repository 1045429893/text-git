package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileStoreDisplay;
import com.hd.entity.generator.MlsdMobileStoreDisplayExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdMobileStoreDisplayGeneratorService  {
    
	
	public Integer countByExample(MlsdMobileStoreDisplayExample mlsdMobileStoreDisplayExample); 

	
    public List<MlsdMobileStoreDisplay> selectByExample(MlsdMobileStoreDisplayExample mlsdMobileStoreDisplayExample); 

				
	public MlsdMobileStoreDisplay selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdMobileStoreDisplay selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdMobileStoreDisplay mlsdMobileStoreDisplay); 

	
    public boolean replaceSelective(MlsdMobileStoreDisplay mlsdMobileStoreDisplay); 

	
    public boolean physicalDeleteByExample(MlsdMobileStoreDisplayExample mlsdMobileStoreDisplayExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdMobileStoreDisplay mlsdMobileStoreDisplay, MlsdMobileStoreDisplayExample mlsdMobileStoreDisplayExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdMobileStoreDisplay mlsdMobileStoreDisplay); 
}