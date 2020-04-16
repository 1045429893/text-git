package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdProductPresentation;
import com.hd.entity.generator.MlsdProductPresentationExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdProductPresentationGeneratorService  {
    
	
	public Integer countByExample(MlsdProductPresentationExample mlsdProductPresentationExample); 

	
    public List<MlsdProductPresentation> selectByExample(MlsdProductPresentationExample mlsdProductPresentationExample); 

				
	public MlsdProductPresentation selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdProductPresentation selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdProductPresentation mlsdProductPresentation); 

	
    public boolean replaceSelective(MlsdProductPresentation mlsdProductPresentation); 

	
    public boolean physicalDeleteByExample(MlsdProductPresentationExample mlsdProductPresentationExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdProductPresentation mlsdProductPresentation, MlsdProductPresentationExample mlsdProductPresentationExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdProductPresentation mlsdProductPresentation); 
}