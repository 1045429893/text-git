package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.SysAuthority;
import com.hd.entity.generator.SysAuthorityExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface SysAuthorityGeneratorService  {
    
	
	public Integer countByExample(SysAuthorityExample sysAuthorityExample); 

	
    public List<SysAuthority> selectByExample(SysAuthorityExample sysAuthorityExample); 

				
	public SysAuthority selectByPrimaryKey(BigInteger primaryKey); 	

	
	public SysAuthority selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(SysAuthority sysAuthority); 

	
    public boolean replaceSelective(SysAuthority sysAuthority); 

	
    public boolean physicalDeleteByExample(SysAuthorityExample sysAuthorityExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(SysAuthority sysAuthority, SysAuthorityExample sysAuthorityExample); 

	
    public boolean updateByPrimaryKeySelective(SysAuthority sysAuthority); 
}