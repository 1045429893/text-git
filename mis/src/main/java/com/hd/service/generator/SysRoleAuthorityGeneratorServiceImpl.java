package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.SysRoleAuthority;
import com.hd.entity.generator.SysRoleAuthorityExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.SysRoleAuthorityKey;
import com.hd.dao.generator.SysRoleAuthorityGeneratorMapper;
import com.hd.api.generator.SysRoleAuthorityGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class SysRoleAuthorityGeneratorServiceImpl implements  SysRoleAuthorityGeneratorService  {
    	
	@Autowired
	private SysRoleAuthorityGeneratorMapper sysRoleAuthorityGeneratorMapper;

	
	@Override
	public Integer countByExample(SysRoleAuthorityExample sysRoleAuthorityExample) {
		return sysRoleAuthorityGeneratorMapper.countByExample(sysRoleAuthorityExample);
	}

	@Override
    public List<SysRoleAuthority> selectByExample(SysRoleAuthorityExample sysRoleAuthorityExample) {
		return sysRoleAuthorityGeneratorMapper.selectByExample(sysRoleAuthorityExample);
	}

	@Override			
	public SysRoleAuthority selectByPrimaryKey(BigInteger primaryKey) {
		SysRoleAuthorityKey sysRoleAuthorityKey = new SysRoleAuthorityKey();
		sysRoleAuthorityKey.setId(primaryKey);
		return sysRoleAuthorityGeneratorMapper.selectByPrimaryKey(sysRoleAuthorityKey);
	}	

	@Override
	public SysRoleAuthority selectUnDelByPrimaryKey(BigInteger primaryKey) {
		SysRoleAuthorityKey sysRoleAuthorityKey = new SysRoleAuthorityKey();
		sysRoleAuthorityKey.setId(primaryKey);
		return sysRoleAuthorityGeneratorMapper.selectUnDelByPrimaryKey(sysRoleAuthorityKey);
	}

	@Override
    public boolean insertSelective(SysRoleAuthority sysRoleAuthority) {
	   return sysRoleAuthorityGeneratorMapper.insertSelective(sysRoleAuthority)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(SysRoleAuthority sysRoleAuthority) {
	   return sysRoleAuthorityGeneratorMapper.replaceSelective(sysRoleAuthority)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(SysRoleAuthorityExample sysRoleAuthorityExample) {
	   return sysRoleAuthorityGeneratorMapper.deleteByExample(sysRoleAuthorityExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		SysRoleAuthorityKey sysRoleAuthorityKey = new SysRoleAuthorityKey();
		sysRoleAuthorityKey.setId(primaryKey);
	   return sysRoleAuthorityGeneratorMapper.deleteByPrimaryKey(sysRoleAuthorityKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(SysRoleAuthority sysRoleAuthority, SysRoleAuthorityExample sysRoleAuthorityExample) {
		return sysRoleAuthorityGeneratorMapper.updateAllByExample(sysRoleAuthority,sysRoleAuthorityExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(SysRoleAuthority sysRoleAuthority) {
		return sysRoleAuthorityGeneratorMapper.updateByPrimaryKeySelective(sysRoleAuthority)> 0 ? true : false;
	}
}