package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.SysRoleAuthority;
import com.hd.entity.generator.SysRoleAuthorityExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface SysRoleAuthorityGeneratorService  {
    
	
	public Integer countByExample(SysRoleAuthorityExample sysRoleAuthorityExample); 

	
    public List<SysRoleAuthority> selectByExample(SysRoleAuthorityExample sysRoleAuthorityExample); 

				
	public SysRoleAuthority selectByPrimaryKey(BigInteger primaryKey); 	

	
	public SysRoleAuthority selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(SysRoleAuthority sysRoleAuthority); 

	
    public boolean replaceSelective(SysRoleAuthority sysRoleAuthority); 

	
    public boolean physicalDeleteByExample(SysRoleAuthorityExample sysRoleAuthorityExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(SysRoleAuthority sysRoleAuthority, SysRoleAuthorityExample sysRoleAuthorityExample); 

	
    public boolean updateByPrimaryKeySelective(SysRoleAuthority sysRoleAuthority); 
}