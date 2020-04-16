package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.SysUserInfo;
import com.hd.entity.generator.SysUserInfoExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.SysUserInfoKey;
import com.hd.dao.generator.SysUserInfoGeneratorMapper;
import com.hd.api.generator.SysUserInfoGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class SysUserInfoGeneratorServiceImpl implements  SysUserInfoGeneratorService  {
    	
	@Autowired
	private SysUserInfoGeneratorMapper sysUserInfoGeneratorMapper;

	
	@Override
	public Integer countByExample(SysUserInfoExample sysUserInfoExample) {
		return sysUserInfoGeneratorMapper.countByExample(sysUserInfoExample);
	}

	@Override
    public List<SysUserInfo> selectByExample(SysUserInfoExample sysUserInfoExample) {
		return sysUserInfoGeneratorMapper.selectByExample(sysUserInfoExample);
	}

	@Override			
	public SysUserInfo selectByPrimaryKey(BigInteger primaryKey) {
		SysUserInfoKey sysUserInfoKey = new SysUserInfoKey();
		sysUserInfoKey.setId(primaryKey);
		return sysUserInfoGeneratorMapper.selectByPrimaryKey(sysUserInfoKey);
	}	

	@Override
	public SysUserInfo selectUnDelByPrimaryKey(BigInteger primaryKey) {
		SysUserInfoKey sysUserInfoKey = new SysUserInfoKey();
		sysUserInfoKey.setId(primaryKey);
		return sysUserInfoGeneratorMapper.selectUnDelByPrimaryKey(sysUserInfoKey);
	}

	@Override
    public boolean insertSelective(SysUserInfo sysUserInfo) {
	   return sysUserInfoGeneratorMapper.insertSelective(sysUserInfo)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(SysUserInfo sysUserInfo) {
	   return sysUserInfoGeneratorMapper.replaceSelective(sysUserInfo)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(SysUserInfoExample sysUserInfoExample) {
	   return sysUserInfoGeneratorMapper.deleteByExample(sysUserInfoExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		SysUserInfoKey sysUserInfoKey = new SysUserInfoKey();
		sysUserInfoKey.setId(primaryKey);
	   return sysUserInfoGeneratorMapper.deleteByPrimaryKey(sysUserInfoKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(SysUserInfo sysUserInfo, SysUserInfoExample sysUserInfoExample) {
		return sysUserInfoGeneratorMapper.updateAllByExample(sysUserInfo,sysUserInfoExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(SysUserInfo sysUserInfo) {
		return sysUserInfoGeneratorMapper.updateByPrimaryKeySelective(sysUserInfo)> 0 ? true : false;
	}
}