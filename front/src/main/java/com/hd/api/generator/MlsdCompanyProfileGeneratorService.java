package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdCompanyProfile;
import com.hd.entity.generator.MlsdCompanyProfileExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdCompanyProfileGeneratorService  {
    
	
	public Integer countByExample(MlsdCompanyProfileExample mlsdCompanyProfileExample); 

	
    public List<MlsdCompanyProfile> selectByExample(MlsdCompanyProfileExample mlsdCompanyProfileExample); 

				
	public MlsdCompanyProfile selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdCompanyProfile selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdCompanyProfile mlsdCompanyProfile); 

	
    public boolean replaceSelective(MlsdCompanyProfile mlsdCompanyProfile); 

	
    public boolean physicalDeleteByExample(MlsdCompanyProfileExample mlsdCompanyProfileExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdCompanyProfile mlsdCompanyProfile, MlsdCompanyProfileExample mlsdCompanyProfileExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdCompanyProfile mlsdCompanyProfile); 
}