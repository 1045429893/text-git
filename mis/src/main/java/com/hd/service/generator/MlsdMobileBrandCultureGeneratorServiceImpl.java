package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileBrandCulture;
import com.hd.entity.generator.MlsdMobileBrandCultureExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdMobileBrandCultureKey;
import com.hd.dao.generator.MlsdMobileBrandCultureGeneratorMapper;
import com.hd.api.generator.MlsdMobileBrandCultureGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdMobileBrandCultureGeneratorServiceImpl implements  MlsdMobileBrandCultureGeneratorService  {
    	
	@Autowired
	private MlsdMobileBrandCultureGeneratorMapper mlsdMobileBrandCultureGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdMobileBrandCultureExample mlsdMobileBrandCultureExample) {
		return mlsdMobileBrandCultureGeneratorMapper.countByExample(mlsdMobileBrandCultureExample);
	}

	@Override
    public List<MlsdMobileBrandCulture> selectByExample(MlsdMobileBrandCultureExample mlsdMobileBrandCultureExample) {
		return mlsdMobileBrandCultureGeneratorMapper.selectByExample(mlsdMobileBrandCultureExample);
	}

	@Override			
	public MlsdMobileBrandCulture selectByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileBrandCultureKey mlsdMobileBrandCultureKey = new MlsdMobileBrandCultureKey();
		mlsdMobileBrandCultureKey.setId(primaryKey);
		return mlsdMobileBrandCultureGeneratorMapper.selectByPrimaryKey(mlsdMobileBrandCultureKey);
	}	

	@Override
	public MlsdMobileBrandCulture selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileBrandCultureKey mlsdMobileBrandCultureKey = new MlsdMobileBrandCultureKey();
		mlsdMobileBrandCultureKey.setId(primaryKey);
		return mlsdMobileBrandCultureGeneratorMapper.selectUnDelByPrimaryKey(mlsdMobileBrandCultureKey);
	}

	@Override
    public boolean insertSelective(MlsdMobileBrandCulture mlsdMobileBrandCulture) {
	   return mlsdMobileBrandCultureGeneratorMapper.insertSelective(mlsdMobileBrandCulture)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdMobileBrandCulture mlsdMobileBrandCulture) {
	   return mlsdMobileBrandCultureGeneratorMapper.replaceSelective(mlsdMobileBrandCulture)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdMobileBrandCultureExample mlsdMobileBrandCultureExample) {
	   return mlsdMobileBrandCultureGeneratorMapper.deleteByExample(mlsdMobileBrandCultureExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileBrandCultureKey mlsdMobileBrandCultureKey = new MlsdMobileBrandCultureKey();
		mlsdMobileBrandCultureKey.setId(primaryKey);
	   return mlsdMobileBrandCultureGeneratorMapper.deleteByPrimaryKey(mlsdMobileBrandCultureKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdMobileBrandCulture mlsdMobileBrandCulture, MlsdMobileBrandCultureExample mlsdMobileBrandCultureExample) {
		return mlsdMobileBrandCultureGeneratorMapper.updateAllByExample(mlsdMobileBrandCulture,mlsdMobileBrandCultureExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdMobileBrandCulture mlsdMobileBrandCulture) {
		return mlsdMobileBrandCultureGeneratorMapper.updateByPrimaryKeySelective(mlsdMobileBrandCulture)> 0 ? true : false;
	}
}