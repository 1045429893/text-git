package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileProductPresentation;
import com.hd.entity.generator.MlsdMobileProductPresentationExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdMobileProductPresentationGeneratorService  {
    
	
	public Integer countByExample(MlsdMobileProductPresentationExample mlsdMobileProductPresentationExample); 

	
    public List<MlsdMobileProductPresentation> selectByExample(MlsdMobileProductPresentationExample mlsdMobileProductPresentationExample); 

				
	public MlsdMobileProductPresentation selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdMobileProductPresentation selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdMobileProductPresentation mlsdMobileProductPresentation); 

	
    public boolean replaceSelective(MlsdMobileProductPresentation mlsdMobileProductPresentation); 

	
    public boolean physicalDeleteByExample(MlsdMobileProductPresentationExample mlsdMobileProductPresentationExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdMobileProductPresentation mlsdMobileProductPresentation, MlsdMobileProductPresentationExample mlsdMobileProductPresentationExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdMobileProductPresentation mlsdMobileProductPresentation); 
}