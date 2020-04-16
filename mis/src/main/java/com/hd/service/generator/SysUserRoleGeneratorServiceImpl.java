package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.SysUserRole;
import com.hd.entity.generator.SysUserRoleExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.SysUserRoleKey;
import com.hd.dao.generator.SysUserRoleGeneratorMapper;
import com.hd.api.generator.SysUserRoleGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class SysUserRoleGeneratorServiceImpl implements  SysUserRoleGeneratorService  {
    	
	@Autowired
	private SysUserRoleGeneratorMapper sysUserRoleGeneratorMapper;

	
	@Override
	public Integer countByExample(SysUserRoleExample sysUserRoleExample) {
		return sysUserRoleGeneratorMapper.countByExample(sysUserRoleExample);
	}

	@Override
    public List<SysUserRole> selectByExample(SysUserRoleExample sysUserRoleExample) {
		return sysUserRoleGeneratorMapper.selectByExample(sysUserRoleExample);
	}

	@Override			
	public SysUserRole selectByPrimaryKey(BigInteger primaryKey) {
		SysUserRoleKey sysUserRoleKey = new SysUserRoleKey();
		sysUserRoleKey.setId(primaryKey);
		return sysUserRoleGeneratorMapper.selectByPrimaryKey(sysUserRoleKey);
	}	

	@Override
	public SysUserRole selectUnDelByPrimaryKey(BigInteger primaryKey) {
		SysUserRoleKey sysUserRoleKey = new SysUserRoleKey();
		sysUserRoleKey.setId(primaryKey);
		return sysUserRoleGeneratorMapper.selectUnDelByPrimaryKey(sysUserRoleKey);
	}

	@Override
    public boolean insertSelective(SysUserRole sysUserRole) {
	   return sysUserRoleGeneratorMapper.insertSelective(sysUserRole)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(SysUserRole sysUserRole) {
	   return sysUserRoleGeneratorMapper.replaceSelective(sysUserRole)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(SysUserRoleExample sysUserRoleExample) {
	   return sysUserRoleGeneratorMapper.deleteByExample(sysUserRoleExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		SysUserRoleKey sysUserRoleKey = new SysUserRoleKey();
		sysUserRoleKey.setId(primaryKey);
	   return sysUserRoleGeneratorMapper.deleteByPrimaryKey(sysUserRoleKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(SysUserRole sysUserRole, SysUserRoleExample sysUserRoleExample) {
		return sysUserRoleGeneratorMapper.updateAllByExample(sysUserRole,sysUserRoleExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(SysUserRole sysUserRole) {
		return sysUserRoleGeneratorMapper.updateByPrimaryKeySelective(sysUserRole)> 0 ? true : false;
	}
}