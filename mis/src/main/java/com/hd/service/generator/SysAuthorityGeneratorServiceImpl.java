package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.SysAuthority;
import com.hd.entity.generator.SysAuthorityExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.SysAuthorityKey;
import com.hd.dao.generator.SysAuthorityGeneratorMapper;
import com.hd.api.generator.SysAuthorityGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class SysAuthorityGeneratorServiceImpl implements  SysAuthorityGeneratorService  {
    	
	@Autowired
	private SysAuthorityGeneratorMapper sysAuthorityGeneratorMapper;

	
	@Override
	public Integer countByExample(SysAuthorityExample sysAuthorityExample) {
		return sysAuthorityGeneratorMapper.countByExample(sysAuthorityExample);
	}

	@Override
    public List<SysAuthority> selectByExample(SysAuthorityExample sysAuthorityExample) {
		return sysAuthorityGeneratorMapper.selectByExample(sysAuthorityExample);
	}

	@Override			
	public SysAuthority selectByPrimaryKey(BigInteger primaryKey) {
		SysAuthorityKey sysAuthorityKey = new SysAuthorityKey();
		sysAuthorityKey.setId(primaryKey);
		return sysAuthorityGeneratorMapper.selectByPrimaryKey(sysAuthorityKey);
	}	

	@Override
	public SysAuthority selectUnDelByPrimaryKey(BigInteger primaryKey) {
		SysAuthorityKey sysAuthorityKey = new SysAuthorityKey();
		sysAuthorityKey.setId(primaryKey);
		return sysAuthorityGeneratorMapper.selectUnDelByPrimaryKey(sysAuthorityKey);
	}

	@Override
    public boolean insertSelective(SysAuthority sysAuthority) {
	   return sysAuthorityGeneratorMapper.insertSelective(sysAuthority)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(SysAuthority sysAuthority) {
	   return sysAuthorityGeneratorMapper.replaceSelective(sysAuthority)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(SysAuthorityExample sysAuthorityExample) {
	   return sysAuthorityGeneratorMapper.deleteByExample(sysAuthorityExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		SysAuthorityKey sysAuthorityKey = new SysAuthorityKey();
		sysAuthorityKey.setId(primaryKey);
	   return sysAuthorityGeneratorMapper.deleteByPrimaryKey(sysAuthorityKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(SysAuthority sysAuthority, SysAuthorityExample sysAuthorityExample) {
		return sysAuthorityGeneratorMapper.updateAllByExample(sysAuthority,sysAuthorityExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(SysAuthority sysAuthority) {
		return sysAuthorityGeneratorMapper.updateByPrimaryKeySelective(sysAuthority)> 0 ? true : false;
	}
}