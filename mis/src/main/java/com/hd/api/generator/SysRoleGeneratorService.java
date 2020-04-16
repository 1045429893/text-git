package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.SysRole;
import com.hd.entity.generator.SysRoleExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface SysRoleGeneratorService  {
    
	
	public Integer countByExample(SysRoleExample sysRoleExample); 

	
    public List<SysRole> selectByExample(SysRoleExample sysRoleExample); 

				
	public SysRole selectByPrimaryKey(BigInteger primaryKey); 	

	
	public SysRole selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(SysRole sysRole); 

	
    public boolean replaceSelective(SysRole sysRole); 

	
    public boolean physicalDeleteByExample(SysRoleExample sysRoleExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(SysRole sysRole, SysRoleExample sysRoleExample); 

	
    public boolean updateByPrimaryKeySelective(SysRole sysRole); 
}