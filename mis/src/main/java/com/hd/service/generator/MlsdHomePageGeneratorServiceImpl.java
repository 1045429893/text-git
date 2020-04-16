package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdHomePage;
import com.hd.entity.generator.MlsdHomePageExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdHomePageKey;
import com.hd.dao.generator.MlsdHomePageGeneratorMapper;
import com.hd.api.generator.MlsdHomePageGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdHomePageGeneratorServiceImpl implements  MlsdHomePageGeneratorService  {
    	
	@Autowired
	private MlsdHomePageGeneratorMapper mlsdHomePageGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdHomePageExample mlsdHomePageExample) {
		return mlsdHomePageGeneratorMapper.countByExample(mlsdHomePageExample);
	}

	@Override
    public List<MlsdHomePage> selectByExample(MlsdHomePageExample mlsdHomePageExample) {
		return mlsdHomePageGeneratorMapper.selectByExample(mlsdHomePageExample);
	}

	@Override			
	public MlsdHomePage selectByPrimaryKey(BigInteger primaryKey) {
		MlsdHomePageKey mlsdHomePageKey = new MlsdHomePageKey();
		mlsdHomePageKey.setId(primaryKey);
		return mlsdHomePageGeneratorMapper.selectByPrimaryKey(mlsdHomePageKey);
	}	

	@Override
	public MlsdHomePage selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdHomePageKey mlsdHomePageKey = new MlsdHomePageKey();
		mlsdHomePageKey.setId(primaryKey);
		return mlsdHomePageGeneratorMapper.selectUnDelByPrimaryKey(mlsdHomePageKey);
	}

	@Override
    public boolean insertSelective(MlsdHomePage mlsdHomePage) {
	   return mlsdHomePageGeneratorMapper.insertSelective(mlsdHomePage)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdHomePage mlsdHomePage) {
	   return mlsdHomePageGeneratorMapper.replaceSelective(mlsdHomePage)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdHomePageExample mlsdHomePageExample) {
	   return mlsdHomePageGeneratorMapper.deleteByExample(mlsdHomePageExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdHomePageKey mlsdHomePageKey = new MlsdHomePageKey();
		mlsdHomePageKey.setId(primaryKey);
	   return mlsdHomePageGeneratorMapper.deleteByPrimaryKey(mlsdHomePageKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdHomePage mlsdHomePage, MlsdHomePageExample mlsdHomePageExample) {
		return mlsdHomePageGeneratorMapper.updateAllByExample(mlsdHomePage,mlsdHomePageExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdHomePage mlsdHomePage) {
		return mlsdHomePageGeneratorMapper.updateByPrimaryKeySelective(mlsdHomePage)> 0 ? true : false;
	}
}