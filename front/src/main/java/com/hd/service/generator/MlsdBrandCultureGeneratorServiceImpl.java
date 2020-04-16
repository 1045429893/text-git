package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdBrandCulture;
import com.hd.entity.generator.MlsdBrandCultureExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdBrandCultureKey;
import com.hd.dao.generator.MlsdBrandCultureGeneratorMapper;
import com.hd.api.generator.MlsdBrandCultureGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdBrandCultureGeneratorServiceImpl implements  MlsdBrandCultureGeneratorService  {
    	
	@Autowired
	private MlsdBrandCultureGeneratorMapper mlsdBrandCultureGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdBrandCultureExample mlsdBrandCultureExample) {
		return mlsdBrandCultureGeneratorMapper.countByExample(mlsdBrandCultureExample);
	}

	@Override
    public List<MlsdBrandCulture> selectByExample(MlsdBrandCultureExample mlsdBrandCultureExample) {
		return mlsdBrandCultureGeneratorMapper.selectByExample(mlsdBrandCultureExample);
	}

	@Override			
	public MlsdBrandCulture selectByPrimaryKey(BigInteger primaryKey) {
		MlsdBrandCultureKey mlsdBrandCultureKey = new MlsdBrandCultureKey();
		mlsdBrandCultureKey.setId(primaryKey);
		return mlsdBrandCultureGeneratorMapper.selectByPrimaryKey(mlsdBrandCultureKey);
	}	

	@Override
	public MlsdBrandCulture selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdBrandCultureKey mlsdBrandCultureKey = new MlsdBrandCultureKey();
		mlsdBrandCultureKey.setId(primaryKey);
		return mlsdBrandCultureGeneratorMapper.selectUnDelByPrimaryKey(mlsdBrandCultureKey);
	}

	@Override
    public boolean insertSelective(MlsdBrandCulture mlsdBrandCulture) {
	   return mlsdBrandCultureGeneratorMapper.insertSelective(mlsdBrandCulture)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdBrandCulture mlsdBrandCulture) {
	   return mlsdBrandCultureGeneratorMapper.replaceSelective(mlsdBrandCulture)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdBrandCultureExample mlsdBrandCultureExample) {
	   return mlsdBrandCultureGeneratorMapper.deleteByExample(mlsdBrandCultureExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdBrandCultureKey mlsdBrandCultureKey = new MlsdBrandCultureKey();
		mlsdBrandCultureKey.setId(primaryKey);
	   return mlsdBrandCultureGeneratorMapper.deleteByPrimaryKey(mlsdBrandCultureKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdBrandCulture mlsdBrandCulture, MlsdBrandCultureExample mlsdBrandCultureExample) {
		return mlsdBrandCultureGeneratorMapper.updateAllByExample(mlsdBrandCulture,mlsdBrandCultureExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdBrandCulture mlsdBrandCulture) {
		return mlsdBrandCultureGeneratorMapper.updateByPrimaryKeySelective(mlsdBrandCulture)> 0 ? true : false;
	}
}