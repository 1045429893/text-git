package com.hd.api.generator;

import java.util.List;
import com.hd.entity.generator.MlsdIntendedUsers;
import com.hd.entity.generator.MlsdIntendedUsersExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;


/**
*@author Robot
*/
@Service
public  interface MlsdIntendedUsersGeneratorService  {
    
	
	public Integer countByExample(MlsdIntendedUsersExample mlsdIntendedUsersExample); 

	
    public List<MlsdIntendedUsers> selectByExample(MlsdIntendedUsersExample mlsdIntendedUsersExample); 

				
	public MlsdIntendedUsers selectByPrimaryKey(BigInteger primaryKey); 	

	
	public MlsdIntendedUsers selectUnDelByPrimaryKey(BigInteger primaryKey); 

	
    public boolean insertSelective(MlsdIntendedUsers mlsdIntendedUsers); 

	
    public boolean replaceSelective(MlsdIntendedUsers mlsdIntendedUsers); 

	
    public boolean physicalDeleteByExample(MlsdIntendedUsersExample mlsdIntendedUsersExample); 

	
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey); 


	
    public boolean updateAllByExample(MlsdIntendedUsers mlsdIntendedUsers, MlsdIntendedUsersExample mlsdIntendedUsersExample); 

	
    public boolean updateByPrimaryKeySelective(MlsdIntendedUsers mlsdIntendedUsers); 
}