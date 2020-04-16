package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdOnlineService;
import com.hd.entity.generator.MlsdOnlineServiceExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdOnlineServiceKey;
import com.hd.dao.generator.MlsdOnlineServiceGeneratorMapper;
import com.hd.api.generator.MlsdOnlineServiceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdOnlineServiceGeneratorServiceImpl implements  MlsdOnlineServiceGeneratorService  {
    	
	@Autowired
	private MlsdOnlineServiceGeneratorMapper mlsdOnlineServiceGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdOnlineServiceExample mlsdOnlineServiceExample) {
		return mlsdOnlineServiceGeneratorMapper.countByExample(mlsdOnlineServiceExample);
	}

	@Override
    public List<MlsdOnlineService> selectByExample(MlsdOnlineServiceExample mlsdOnlineServiceExample) {
		return mlsdOnlineServiceGeneratorMapper.selectByExample(mlsdOnlineServiceExample);
	}

	@Override			
	public MlsdOnlineService selectByPrimaryKey(BigInteger primaryKey) {
		MlsdOnlineServiceKey mlsdOnlineServiceKey = new MlsdOnlineServiceKey();
		mlsdOnlineServiceKey.setId(primaryKey);
		return mlsdOnlineServiceGeneratorMapper.selectByPrimaryKey(mlsdOnlineServiceKey);
	}	

	@Override
	public MlsdOnlineService selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdOnlineServiceKey mlsdOnlineServiceKey = new MlsdOnlineServiceKey();
		mlsdOnlineServiceKey.setId(primaryKey);
		return mlsdOnlineServiceGeneratorMapper.selectUnDelByPrimaryKey(mlsdOnlineServiceKey);
	}

	@Override
    public boolean insertSelective(MlsdOnlineService mlsdOnlineService) {
	   return mlsdOnlineServiceGeneratorMapper.insertSelective(mlsdOnlineService)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdOnlineService mlsdOnlineService) {
	   return mlsdOnlineServiceGeneratorMapper.replaceSelective(mlsdOnlineService)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdOnlineServiceExample mlsdOnlineServiceExample) {
	   return mlsdOnlineServiceGeneratorMapper.deleteByExample(mlsdOnlineServiceExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdOnlineServiceKey mlsdOnlineServiceKey = new MlsdOnlineServiceKey();
		mlsdOnlineServiceKey.setId(primaryKey);
	   return mlsdOnlineServiceGeneratorMapper.deleteByPrimaryKey(mlsdOnlineServiceKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdOnlineService mlsdOnlineService, MlsdOnlineServiceExample mlsdOnlineServiceExample) {
		return mlsdOnlineServiceGeneratorMapper.updateAllByExample(mlsdOnlineService,mlsdOnlineServiceExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdOnlineService mlsdOnlineService) {
		return mlsdOnlineServiceGeneratorMapper.updateByPrimaryKeySelective(mlsdOnlineService)> 0 ? true : false;
	}
}