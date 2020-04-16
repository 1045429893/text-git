package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.SysResources;
import com.hd.entity.generator.SysResourcesExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.SysResourcesKey;
import com.hd.dao.generator.SysResourcesGeneratorMapper;
import com.hd.api.generator.SysResourcesGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class SysResourcesGeneratorServiceImpl implements  SysResourcesGeneratorService  {
    	
	@Autowired
	private SysResourcesGeneratorMapper sysResourcesGeneratorMapper;

	
	@Override
	public Integer countByExample(SysResourcesExample sysResourcesExample) {
		return sysResourcesGeneratorMapper.countByExample(sysResourcesExample);
	}

	@Override
    public List<SysResources> selectByExample(SysResourcesExample sysResourcesExample) {
		return sysResourcesGeneratorMapper.selectByExample(sysResourcesExample);
	}

	@Override			
	public SysResources selectByPrimaryKey(BigInteger primaryKey) {
		SysResourcesKey sysResourcesKey = new SysResourcesKey();
		sysResourcesKey.setId(primaryKey);
		return sysResourcesGeneratorMapper.selectByPrimaryKey(sysResourcesKey);
	}	

	@Override
	public SysResources selectUnDelByPrimaryKey(BigInteger primaryKey) {
		SysResourcesKey sysResourcesKey = new SysResourcesKey();
		sysResourcesKey.setId(primaryKey);
		return sysResourcesGeneratorMapper.selectUnDelByPrimaryKey(sysResourcesKey);
	}

	@Override
    public boolean insertSelective(SysResources sysResources) {
	   return sysResourcesGeneratorMapper.insertSelective(sysResources)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(SysResources sysResources) {
	   return sysResourcesGeneratorMapper.replaceSelective(sysResources)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(SysResourcesExample sysResourcesExample) {
	   return sysResourcesGeneratorMapper.deleteByExample(sysResourcesExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		SysResourcesKey sysResourcesKey = new SysResourcesKey();
		sysResourcesKey.setId(primaryKey);
	   return sysResourcesGeneratorMapper.deleteByPrimaryKey(sysResourcesKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(SysResources sysResources, SysResourcesExample sysResourcesExample) {
		return sysResourcesGeneratorMapper.updateAllByExample(sysResources,sysResourcesExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(SysResources sysResources) {
		return sysResourcesGeneratorMapper.updateByPrimaryKeySelective(sysResources)> 0 ? true : false;
	}
}