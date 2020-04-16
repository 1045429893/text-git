package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.SysAuthorityResources;
import com.hd.entity.generator.SysAuthorityResourcesExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface SysAuthorityResourcesGeneratorService  {
    
	
	public Integer countByExample(SysAuthorityResourcesExample sysAuthorityResourcesExample); 

	
    public List<SysAuthorityResources> selectByExample(SysAuthorityResourcesExample sysAuthorityResourcesExample); 

				
	public SysAuthorityResources selectByPrimaryKey(BigInteger primaryKey); 	

	
	public SysAuthorityResources selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(SysAuthorityResources sysAuthorityResources); 

	
    public boolean replaceSelective(SysAuthorityResources sysAuthorityResources); 

	
    public boolean physicalDeleteByExample(SysAuthorityResourcesExample sysAuthorityResourcesExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(SysAuthorityResources sysAuthorityResources, SysAuthorityResourcesExample sysAuthorityResourcesExample); 

	
    public boolean updateByPrimaryKeySelective(SysAuthorityResources sysAuthorityResources); 
}