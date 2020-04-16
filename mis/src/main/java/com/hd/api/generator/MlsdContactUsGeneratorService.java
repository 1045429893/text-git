package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdContactUs;
import com.hd.entity.generator.MlsdContactUsExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdContactUsGeneratorService  {
    
	
	public Integer countByExample(MlsdContactUsExample mlsdContactUsExample); 

	
    public List<MlsdContactUs> selectByExample(MlsdContactUsExample mlsdContactUsExample); 

				
	public MlsdContactUs selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdContactUs selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdContactUs mlsdContactUs); 

	
    public boolean replaceSelective(MlsdContactUs mlsdContactUs); 

	
    public boolean physicalDeleteByExample(MlsdContactUsExample mlsdContactUsExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdContactUs mlsdContactUs, MlsdContactUsExample mlsdContactUsExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdContactUs mlsdContactUs); 
}