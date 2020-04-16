package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdMobileStoreDisplay;
import com.hd.entity.generator.MlsdMobileStoreDisplayExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdMobileStoreDisplayKey;
import com.hd.dao.generator.MlsdMobileStoreDisplayGeneratorMapper;
import com.hd.api.generator.MlsdMobileStoreDisplayGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdMobileStoreDisplayGeneratorServiceImpl implements  MlsdMobileStoreDisplayGeneratorService  {
    	
	@Autowired
	private MlsdMobileStoreDisplayGeneratorMapper mlsdMobileStoreDisplayGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdMobileStoreDisplayExample mlsdMobileStoreDisplayExample) {
		return mlsdMobileStoreDisplayGeneratorMapper.countByExample(mlsdMobileStoreDisplayExample);
	}

	@Override
    public List<MlsdMobileStoreDisplay> selectByExample(MlsdMobileStoreDisplayExample mlsdMobileStoreDisplayExample) {
		return mlsdMobileStoreDisplayGeneratorMapper.selectByExample(mlsdMobileStoreDisplayExample);
	}

	@Override			
	public MlsdMobileStoreDisplay selectByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileStoreDisplayKey mlsdMobileStoreDisplayKey = new MlsdMobileStoreDisplayKey();
		mlsdMobileStoreDisplayKey.setId(primaryKey);
		return mlsdMobileStoreDisplayGeneratorMapper.selectByPrimaryKey(mlsdMobileStoreDisplayKey);
	}	

	@Override
	public MlsdMobileStoreDisplay selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileStoreDisplayKey mlsdMobileStoreDisplayKey = new MlsdMobileStoreDisplayKey();
		mlsdMobileStoreDisplayKey.setId(primaryKey);
		return mlsdMobileStoreDisplayGeneratorMapper.selectUnDelByPrimaryKey(mlsdMobileStoreDisplayKey);
	}

	@Override
    public boolean insertSelective(MlsdMobileStoreDisplay mlsdMobileStoreDisplay) {
	   return mlsdMobileStoreDisplayGeneratorMapper.insertSelective(mlsdMobileStoreDisplay)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdMobileStoreDisplay mlsdMobileStoreDisplay) {
	   return mlsdMobileStoreDisplayGeneratorMapper.replaceSelective(mlsdMobileStoreDisplay)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdMobileStoreDisplayExample mlsdMobileStoreDisplayExample) {
	   return mlsdMobileStoreDisplayGeneratorMapper.deleteByExample(mlsdMobileStoreDisplayExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdMobileStoreDisplayKey mlsdMobileStoreDisplayKey = new MlsdMobileStoreDisplayKey();
		mlsdMobileStoreDisplayKey.setId(primaryKey);
	   return mlsdMobileStoreDisplayGeneratorMapper.deleteByPrimaryKey(mlsdMobileStoreDisplayKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdMobileStoreDisplay mlsdMobileStoreDisplay, MlsdMobileStoreDisplayExample mlsdMobileStoreDisplayExample) {
		return mlsdMobileStoreDisplayGeneratorMapper.updateAllByExample(mlsdMobileStoreDisplay,mlsdMobileStoreDisplayExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdMobileStoreDisplay mlsdMobileStoreDisplay) {
		return mlsdMobileStoreDisplayGeneratorMapper.updateByPrimaryKeySelective(mlsdMobileStoreDisplay)> 0 ? true : false;
	}
}