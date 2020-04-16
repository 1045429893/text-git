package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdContactUs;
import com.hd.entity.generator.MlsdContactUsExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdContactUsKey;
import com.hd.dao.generator.MlsdContactUsGeneratorMapper;
import com.hd.api.generator.MlsdContactUsGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdContactUsGeneratorServiceImpl implements  MlsdContactUsGeneratorService  {
    	
	@Autowired
	private MlsdContactUsGeneratorMapper mlsdContactUsGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdContactUsExample mlsdContactUsExample) {
		return mlsdContactUsGeneratorMapper.countByExample(mlsdContactUsExample);
	}

	@Override
    public List<MlsdContactUs> selectByExample(MlsdContactUsExample mlsdContactUsExample) {
		return mlsdContactUsGeneratorMapper.selectByExample(mlsdContactUsExample);
	}

	@Override			
	public MlsdContactUs selectByPrimaryKey(BigInteger primaryKey) {
		MlsdContactUsKey mlsdContactUsKey = new MlsdContactUsKey();
		mlsdContactUsKey.setId(primaryKey);
		return mlsdContactUsGeneratorMapper.selectByPrimaryKey(mlsdContactUsKey);
	}	

	@Override
	public MlsdContactUs selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdContactUsKey mlsdContactUsKey = new MlsdContactUsKey();
		mlsdContactUsKey.setId(primaryKey);
		return mlsdContactUsGeneratorMapper.selectUnDelByPrimaryKey(mlsdContactUsKey);
	}

	@Override
    public boolean insertSelective(MlsdContactUs mlsdContactUs) {
	   return mlsdContactUsGeneratorMapper.insertSelective(mlsdContactUs)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdContactUs mlsdContactUs) {
	   return mlsdContactUsGeneratorMapper.replaceSelective(mlsdContactUs)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdContactUsExample mlsdContactUsExample) {
	   return mlsdContactUsGeneratorMapper.deleteByExample(mlsdContactUsExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdContactUsKey mlsdContactUsKey = new MlsdContactUsKey();
		mlsdContactUsKey.setId(primaryKey);
	   return mlsdContactUsGeneratorMapper.deleteByPrimaryKey(mlsdContactUsKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdContactUs mlsdContactUs, MlsdContactUsExample mlsdContactUsExample) {
		return mlsdContactUsGeneratorMapper.updateAllByExample(mlsdContactUs,mlsdContactUsExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdContactUs mlsdContactUs) {
		return mlsdContactUsGeneratorMapper.updateByPrimaryKeySelective(mlsdContactUs)> 0 ? true : false;
	}
}