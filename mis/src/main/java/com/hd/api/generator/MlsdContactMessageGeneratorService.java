package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdContactMessage;
import com.hd.entity.generator.MlsdContactMessageExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdContactMessageGeneratorService  {
    
	
	public Integer countByExample(MlsdContactMessageExample mlsdContactMessageExample); 

	
    public List<MlsdContactMessage> selectByExample(MlsdContactMessageExample mlsdContactMessageExample); 

				
	public MlsdContactMessage selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdContactMessage selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdContactMessage mlsdContactMessage); 

	
    public boolean replaceSelective(MlsdContactMessage mlsdContactMessage); 

	
    public boolean physicalDeleteByExample(MlsdContactMessageExample mlsdContactMessageExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdContactMessage mlsdContactMessage, MlsdContactMessageExample mlsdContactMessageExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdContactMessage mlsdContactMessage); 
}