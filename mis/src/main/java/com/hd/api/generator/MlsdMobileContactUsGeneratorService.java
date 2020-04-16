package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileContactUs;
import com.hd.entity.generator.MlsdMobileContactUsExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdMobileContactUsGeneratorService  {
    
	
	public Integer countByExample(MlsdMobileContactUsExample mlsdMobileContactUsExample); 

	
    public List<MlsdMobileContactUs> selectByExample(MlsdMobileContactUsExample mlsdMobileContactUsExample); 

				
	public MlsdMobileContactUs selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdMobileContactUs selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdMobileContactUs mlsdMobileContactUs); 

	
    public boolean replaceSelective(MlsdMobileContactUs mlsdMobileContactUs); 

	
    public boolean physicalDeleteByExample(MlsdMobileContactUsExample mlsdMobileContactUsExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdMobileContactUs mlsdMobileContactUs, MlsdMobileContactUsExample mlsdMobileContactUsExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdMobileContactUs mlsdMobileContactUs); 
}