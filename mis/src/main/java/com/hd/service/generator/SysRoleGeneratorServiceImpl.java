package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.SysRole;
import com.hd.entity.generator.SysRoleExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.SysRoleKey;
import com.hd.dao.generator.SysRoleGeneratorMapper;
import com.hd.api.generator.SysRoleGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class SysRoleGeneratorServiceImpl implements  SysRoleGeneratorService  {
    	
	@Autowired
	private SysRoleGeneratorMapper sysRoleGeneratorMapper;

	
	@Override
	public Integer countByExample(SysRoleExample sysRoleExample) {
		return sysRoleGeneratorMapper.countByExample(sysRoleExample);
	}

	@Override
    public List<SysRole> selectByExample(SysRoleExample sysRoleExample) {
		return sysRoleGeneratorMapper.selectByExample(sysRoleExample);
	}

	@Override			
	public SysRole selectByPrimaryKey(BigInteger primaryKey) {
		SysRoleKey sysRoleKey = new SysRoleKey();
		sysRoleKey.setId(primaryKey);
		return sysRoleGeneratorMapper.selectByPrimaryKey(sysRoleKey);
	}	

	@Override
	public SysRole selectUnDelByPrimaryKey(BigInteger primaryKey) {
		SysRoleKey sysRoleKey = new SysRoleKey();
		sysRoleKey.setId(primaryKey);
		return sysRoleGeneratorMapper.selectUnDelByPrimaryKey(sysRoleKey);
	}

	@Override
    public boolean insertSelective(SysRole sysRole) {
	   return sysRoleGeneratorMapper.insertSelective(sysRole)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(SysRole sysRole) {
	   return sysRoleGeneratorMapper.replaceSelective(sysRole)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(SysRoleExample sysRoleExample) {
	   return sysRoleGeneratorMapper.deleteByExample(sysRoleExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		SysRoleKey sysRoleKey = new SysRoleKey();
		sysRoleKey.setId(primaryKey);
	   return sysRoleGeneratorMapper.deleteByPrimaryKey(sysRoleKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(SysRole sysRole, SysRoleExample sysRoleExample) {
		return sysRoleGeneratorMapper.updateAllByExample(sysRole,sysRoleExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(SysRole sysRole) {
		return sysRoleGeneratorMapper.updateByPrimaryKeySelective(sysRole)> 0 ? true : false;
	}
}