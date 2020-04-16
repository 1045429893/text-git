package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileContactUs;
import com.hd.entity.generator.MlsdMobileContactUsExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdMobileContactUsKey;
import com.hd.dao.generator.MlsdMobileContactUsGeneratorMapper;
import com.hd.api.generator.MlsdMobileContactUsGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdMobileContactUsGeneratorServiceImpl implements  MlsdMobileContactUsGeneratorService  {
    	
	@Autowired
	private MlsdMobileContactUsGeneratorMapper mlsdMobileContactUsGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdMobileContactUsExample mlsdMobileContactUsExample) {
		return mlsdMobileContactUsGeneratorMapper.countByExample(mlsdMobileContactUsExample);
	}

	@Override
    public List<MlsdMobileContactUs> selectByExample(MlsdMobileContactUsExample mlsdMobileContactUsExample) {
		return mlsdMobileContactUsGeneratorMapper.selectByExample(mlsdMobileContactUsExample);
	}

	@Override			
	public MlsdMobileContactUs selectByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileContactUsKey mlsdMobileContactUsKey = new MlsdMobileContactUsKey();
		mlsdMobileContactUsKey.setId(primaryKey);
		return mlsdMobileContactUsGeneratorMapper.selectByPrimaryKey(mlsdMobileContactUsKey);
	}	

	@Override
	public MlsdMobileContactUs selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileContactUsKey mlsdMobileContactUsKey = new MlsdMobileContactUsKey();
		mlsdMobileContactUsKey.setId(primaryKey);
		return mlsdMobileContactUsGeneratorMapper.selectUnDelByPrimaryKey(mlsdMobileContactUsKey);
	}

	@Override
    public boolean insertSelective(MlsdMobileContactUs mlsdMobileContactUs) {
	   return mlsdMobileContactUsGeneratorMapper.insertSelective(mlsdMobileContactUs)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdMobileContactUs mlsdMobileContactUs) {
	   return mlsdMobileContactUsGeneratorMapper.replaceSelective(mlsdMobileContactUs)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdMobileContactUsExample mlsdMobileContactUsExample) {
	   return mlsdMobileContactUsGeneratorMapper.deleteByExample(mlsdMobileContactUsExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileContactUsKey mlsdMobileContactUsKey = new MlsdMobileContactUsKey();
		mlsdMobileContactUsKey.setId(primaryKey);
	   return mlsdMobileContactUsGeneratorMapper.deleteByPrimaryKey(mlsdMobileContactUsKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdMobileContactUs mlsdMobileContactUs, MlsdMobileContactUsExample mlsdMobileContactUsExample) {
		return mlsdMobileContactUsGeneratorMapper.updateAllByExample(mlsdMobileContactUs,mlsdMobileContactUsExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdMobileContactUs mlsdMobileContactUs) {
		return mlsdMobileContactUsGeneratorMapper.updateByPrimaryKeySelective(mlsdMobileContactUs)> 0 ? true : false;
	}
}