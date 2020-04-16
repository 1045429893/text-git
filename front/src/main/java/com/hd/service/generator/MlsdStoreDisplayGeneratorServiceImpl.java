package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdStoreDisplay;
import com.hd.entity.generator.MlsdStoreDisplayExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdStoreDisplayKey;
import com.hd.dao.generator.MlsdStoreDisplayGeneratorMapper;
import com.hd.api.generator.MlsdStoreDisplayGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdStoreDisplayGeneratorServiceImpl implements  MlsdStoreDisplayGeneratorService  {
    	
	@Autowired
	private MlsdStoreDisplayGeneratorMapper mlsdStoreDisplayGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdStoreDisplayExample mlsdStoreDisplayExample) {
		return mlsdStoreDisplayGeneratorMapper.countByExample(mlsdStoreDisplayExample);
	}

	@Override
    public List<MlsdStoreDisplay> selectByExample(MlsdStoreDisplayExample mlsdStoreDisplayExample) {
		return mlsdStoreDisplayGeneratorMapper.selectByExample(mlsdStoreDisplayExample);
	}

	@Override			
	public MlsdStoreDisplay selectByPrimaryKey(BigInteger primaryKey) {
		MlsdStoreDisplayKey mlsdStoreDisplayKey = new MlsdStoreDisplayKey();
		mlsdStoreDisplayKey.setId(primaryKey);
		return mlsdStoreDisplayGeneratorMapper.selectByPrimaryKey(mlsdStoreDisplayKey);
	}	

	@Override
	public MlsdStoreDisplay selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdStoreDisplayKey mlsdStoreDisplayKey = new MlsdStoreDisplayKey();
		mlsdStoreDisplayKey.setId(primaryKey);
		return mlsdStoreDisplayGeneratorMapper.selectUnDelByPrimaryKey(mlsdStoreDisplayKey);
	}

	@Override
    public boolean insertSelective(MlsdStoreDisplay mlsdStoreDisplay) {
	   return mlsdStoreDisplayGeneratorMapper.insertSelective(mlsdStoreDisplay)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdStoreDisplay mlsdStoreDisplay) {
	   return mlsdStoreDisplayGeneratorMapper.replaceSelective(mlsdStoreDisplay)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdStoreDisplayExample mlsdStoreDisplayExample) {
	   return mlsdStoreDisplayGeneratorMapper.deleteByExample(mlsdStoreDisplayExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdStoreDisplayKey mlsdStoreDisplayKey = new MlsdStoreDisplayKey();
		mlsdStoreDisplayKey.setId(primaryKey);
	   return mlsdStoreDisplayGeneratorMapper.deleteByPrimaryKey(mlsdStoreDisplayKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdStoreDisplay mlsdStoreDisplay, MlsdStoreDisplayExample mlsdStoreDisplayExample) {
		return mlsdStoreDisplayGeneratorMapper.updateAllByExample(mlsdStoreDisplay,mlsdStoreDisplayExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdStoreDisplay mlsdStoreDisplay) {
		return mlsdStoreDisplayGeneratorMapper.updateByPrimaryKeySelective(mlsdStoreDisplay)> 0 ? true : false;
	}
}