package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.SysResources;
import com.hd.entity.generator.SysResourcesExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface SysResourcesGeneratorService  {
    
	
	public Integer countByExample(SysResourcesExample sysResourcesExample); 

	
    public List<SysResources> selectByExample(SysResourcesExample sysResourcesExample); 

				
	public SysResources selectByPrimaryKey(BigInteger primaryKey); 	

	
	public SysResources selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(SysResources sysResources); 

	
    public boolean replaceSelective(SysResources sysResources); 

	
    public boolean physicalDeleteByExample(SysResourcesExample sysResourcesExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(SysResources sysResources, SysResourcesExample sysResourcesExample); 

	
    public boolean updateByPrimaryKeySelective(SysResources sysResources); 
}