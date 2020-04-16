package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileHomePage;
import com.hd.entity.generator.MlsdMobileHomePageExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdMobileHomePageKey;
import com.hd.dao.generator.MlsdMobileHomePageGeneratorMapper;
import com.hd.api.generator.MlsdMobileHomePageGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdMobileHomePageGeneratorServiceImpl implements  MlsdMobileHomePageGeneratorService  {
    	
	@Autowired
	private MlsdMobileHomePageGeneratorMapper mlsdMobileHomePageGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdMobileHomePageExample mlsdMobileHomePageExample) {
		return mlsdMobileHomePageGeneratorMapper.countByExample(mlsdMobileHomePageExample);
	}

	@Override
    public List<MlsdMobileHomePage> selectByExample(MlsdMobileHomePageExample mlsdMobileHomePageExample) {
		return mlsdMobileHomePageGeneratorMapper.selectByExample(mlsdMobileHomePageExample);
	}

	@Override			
	public MlsdMobileHomePage selectByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileHomePageKey mlsdMobileHomePageKey = new MlsdMobileHomePageKey();
		mlsdMobileHomePageKey.setId(primaryKey);
		return mlsdMobileHomePageGeneratorMapper.selectByPrimaryKey(mlsdMobileHomePageKey);
	}	

	@Override
	public MlsdMobileHomePage selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileHomePageKey mlsdMobileHomePageKey = new MlsdMobileHomePageKey();
		mlsdMobileHomePageKey.setId(primaryKey);
		return mlsdMobileHomePageGeneratorMapper.selectUnDelByPrimaryKey(mlsdMobileHomePageKey);
	}

	@Override
    public boolean insertSelective(MlsdMobileHomePage mlsdMobileHomePage) {
	   return mlsdMobileHomePageGeneratorMapper.insertSelective(mlsdMobileHomePage)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdMobileHomePage mlsdMobileHomePage) {
	   return mlsdMobileHomePageGeneratorMapper.replaceSelective(mlsdMobileHomePage)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdMobileHomePageExample mlsdMobileHomePageExample) {
	   return mlsdMobileHomePageGeneratorMapper.deleteByExample(mlsdMobileHomePageExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileHomePageKey mlsdMobileHomePageKey = new MlsdMobileHomePageKey();
		mlsdMobileHomePageKey.setId(primaryKey);
	   return mlsdMobileHomePageGeneratorMapper.deleteByPrimaryKey(mlsdMobileHomePageKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdMobileHomePage mlsdMobileHomePage, MlsdMobileHomePageExample mlsdMobileHomePageExample) {
		return mlsdMobileHomePageGeneratorMapper.updateAllByExample(mlsdMobileHomePage,mlsdMobileHomePageExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdMobileHomePage mlsdMobileHomePage) {
		return mlsdMobileHomePageGeneratorMapper.updateByPrimaryKeySelective(mlsdMobileHomePage)> 0 ? true : false;
	}
}