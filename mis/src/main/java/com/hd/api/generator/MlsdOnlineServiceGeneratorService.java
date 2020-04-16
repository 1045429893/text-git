package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdOnlineService;
import com.hd.entity.generator.MlsdOnlineServiceExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdOnlineServiceGeneratorService  {
    
	
	public Integer countByExample(MlsdOnlineServiceExample mlsdOnlineServiceExample); 

	
    public List<MlsdOnlineService> selectByExample(MlsdOnlineServiceExample mlsdOnlineServiceExample); 

				
	public MlsdOnlineService selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdOnlineService selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdOnlineService mlsdOnlineService); 

	
    public boolean replaceSelective(MlsdOnlineService mlsdOnlineService); 

	
    public boolean physicalDeleteByExample(MlsdOnlineServiceExample mlsdOnlineServiceExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdOnlineService mlsdOnlineService, MlsdOnlineServiceExample mlsdOnlineServiceExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdOnlineService mlsdOnlineService); 
}