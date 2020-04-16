package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.SysAuthorityResources;
import com.hd.entity.generator.SysAuthorityResourcesExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.SysAuthorityResourcesKey;
import com.hd.dao.generator.SysAuthorityResourcesGeneratorMapper;
import com.hd.api.generator.SysAuthorityResourcesGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class SysAuthorityResourcesGeneratorServiceImpl implements  SysAuthorityResourcesGeneratorService  {
    	
	@Autowired
	private SysAuthorityResourcesGeneratorMapper sysAuthorityResourcesGeneratorMapper;

	
	@Override
	public Integer countByExample(SysAuthorityResourcesExample sysAuthorityResourcesExample) {
		return sysAuthorityResourcesGeneratorMapper.countByExample(sysAuthorityResourcesExample);
	}

	@Override
    public List<SysAuthorityResources> selectByExample(SysAuthorityResourcesExample sysAuthorityResourcesExample) {
		return sysAuthorityResourcesGeneratorMapper.selectByExample(sysAuthorityResourcesExample);
	}

	@Override			
	public SysAuthorityResources selectByPrimaryKey(BigInteger primaryKey) {
		SysAuthorityResourcesKey sysAuthorityResourcesKey = new SysAuthorityResourcesKey();
		sysAuthorityResourcesKey.setId(primaryKey);
		return sysAuthorityResourcesGeneratorMapper.selectByPrimaryKey(sysAuthorityResourcesKey);
	}	

	@Override
	public SysAuthorityResources selectUnDelByPrimaryKey(BigInteger primaryKey) {
		SysAuthorityResourcesKey sysAuthorityResourcesKey = new SysAuthorityResourcesKey();
		sysAuthorityResourcesKey.setId(primaryKey);
		return sysAuthorityResourcesGeneratorMapper.selectUnDelByPrimaryKey(sysAuthorityResourcesKey);
	}

	@Override
    public boolean insertSelective(SysAuthorityResources sysAuthorityResources) {
	   return sysAuthorityResourcesGeneratorMapper.insertSelective(sysAuthorityResources)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(SysAuthorityResources sysAuthorityResources) {
	   return sysAuthorityResourcesGeneratorMapper.replaceSelective(sysAuthorityResources)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(SysAuthorityResourcesExample sysAuthorityResourcesExample) {
	   return sysAuthorityResourcesGeneratorMapper.deleteByExample(sysAuthorityResourcesExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		SysAuthorityResourcesKey sysAuthorityResourcesKey = new SysAuthorityResourcesKey();
		sysAuthorityResourcesKey.setId(primaryKey);
	   return sysAuthorityResourcesGeneratorMapper.deleteByPrimaryKey(sysAuthorityResourcesKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(SysAuthorityResources sysAuthorityResources, SysAuthorityResourcesExample sysAuthorityResourcesExample) {
		return sysAuthorityResourcesGeneratorMapper.updateAllByExample(sysAuthorityResources,sysAuthorityResourcesExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(SysAuthorityResources sysAuthorityResources) {
		return sysAuthorityResourcesGeneratorMapper.updateByPrimaryKeySelective(sysAuthorityResources)> 0 ? true : false;
	}
}