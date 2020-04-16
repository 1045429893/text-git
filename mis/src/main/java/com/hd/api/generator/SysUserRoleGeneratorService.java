package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.SysUserRole;
import com.hd.entity.generator.SysUserRoleExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface SysUserRoleGeneratorService  {
    
	
	public Integer countByExample(SysUserRoleExample sysUserRoleExample); 

	
    public List<SysUserRole> selectByExample(SysUserRoleExample sysUserRoleExample); 

				
	public SysUserRole selectByPrimaryKey(BigInteger primaryKey); 	

	
	public SysUserRole selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(SysUserRole sysUserRole); 

	
    public boolean replaceSelective(SysUserRole sysUserRole); 

	
    public boolean physicalDeleteByExample(SysUserRoleExample sysUserRoleExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(SysUserRole sysUserRole, SysUserRoleExample sysUserRoleExample); 

	
    public boolean updateByPrimaryKeySelective(SysUserRole sysUserRole); 
}