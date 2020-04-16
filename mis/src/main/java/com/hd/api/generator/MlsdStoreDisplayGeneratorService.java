package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdStoreDisplay;
import com.hd.entity.generator.MlsdStoreDisplayExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdStoreDisplayGeneratorService  {
    
	
	public Integer countByExample(MlsdStoreDisplayExample mlsdStoreDisplayExample); 

	
    public List<MlsdStoreDisplay> selectByExample(MlsdStoreDisplayExample mlsdStoreDisplayExample); 

				
	public MlsdStoreDisplay selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdStoreDisplay selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdStoreDisplay mlsdStoreDisplay); 

	
    public boolean replaceSelective(MlsdStoreDisplay mlsdStoreDisplay); 

	
    public boolean physicalDeleteByExample(MlsdStoreDisplayExample mlsdStoreDisplayExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdStoreDisplay mlsdStoreDisplay, MlsdStoreDisplayExample mlsdStoreDisplayExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdStoreDisplay mlsdStoreDisplay); 
}