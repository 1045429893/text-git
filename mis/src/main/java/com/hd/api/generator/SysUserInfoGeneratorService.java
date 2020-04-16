package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.SysUserInfo;
import com.hd.entity.generator.SysUserInfoExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface SysUserInfoGeneratorService  {
    
	
	public Integer countByExample(SysUserInfoExample sysUserInfoExample); 

	
    public List<SysUserInfo> selectByExample(SysUserInfoExample sysUserInfoExample); 

				
	public SysUserInfo selectByPrimaryKey(BigInteger primaryKey); 	

	
	public SysUserInfo selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(SysUserInfo sysUserInfo); 

	
    public boolean replaceSelective(SysUserInfo sysUserInfo); 

	
    public boolean physicalDeleteByExample(SysUserInfoExample sysUserInfoExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(SysUserInfo sysUserInfo, SysUserInfoExample sysUserInfoExample); 

	
    public boolean updateByPrimaryKeySelective(SysUserInfo sysUserInfo); 
}