package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdCompanyProfile;
import com.hd.entity.generator.MlsdCompanyProfileExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdCompanyProfileKey;
import com.hd.dao.generator.MlsdCompanyProfileGeneratorMapper;
import com.hd.api.generator.MlsdCompanyProfileGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdCompanyProfileGeneratorServiceImpl implements  MlsdCompanyProfileGeneratorService  {
    	
	@Autowired
	private MlsdCompanyProfileGeneratorMapper mlsdCompanyProfileGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdCompanyProfileExample mlsdCompanyProfileExample) {
		return mlsdCompanyProfileGeneratorMapper.countByExample(mlsdCompanyProfileExample);
	}

	@Override
    public List<MlsdCompanyProfile> selectByExample(MlsdCompanyProfileExample mlsdCompanyProfileExample) {
		return mlsdCompanyProfileGeneratorMapper.selectByExample(mlsdCompanyProfileExample);
	}

	@Override			
	public MlsdCompanyProfile selectByPrimaryKey(BigInteger primaryKey) {
		MlsdCompanyProfileKey mlsdCompanyProfileKey = new MlsdCompanyProfileKey();
		mlsdCompanyProfileKey.setId(primaryKey);
		return mlsdCompanyProfileGeneratorMapper.selectByPrimaryKey(mlsdCompanyProfileKey);
	}	

	@Override
	public MlsdCompanyProfile selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdCompanyProfileKey mlsdCompanyProfileKey = new MlsdCompanyProfileKey();
		mlsdCompanyProfileKey.setId(primaryKey);
		return mlsdCompanyProfileGeneratorMapper.selectUnDelByPrimaryKey(mlsdCompanyProfileKey);
	}

	@Override
    public boolean insertSelective(MlsdCompanyProfile mlsdCompanyProfile) {
	   return mlsdCompanyProfileGeneratorMapper.insertSelective(mlsdCompanyProfile)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdCompanyProfile mlsdCompanyProfile) {
	   return mlsdCompanyProfileGeneratorMapper.replaceSelective(mlsdCompanyProfile)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdCompanyProfileExample mlsdCompanyProfileExample) {
	   return mlsdCompanyProfileGeneratorMapper.deleteByExample(mlsdCompanyProfileExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdCompanyProfileKey mlsdCompanyProfileKey = new MlsdCompanyProfileKey();
		mlsdCompanyProfileKey.setId(primaryKey);
	   return mlsdCompanyProfileGeneratorMapper.deleteByPrimaryKey(mlsdCompanyProfileKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdCompanyProfile mlsdCompanyProfile, MlsdCompanyProfileExample mlsdCompanyProfileExample) {
		return mlsdCompanyProfileGeneratorMapper.updateAllByExample(mlsdCompanyProfile,mlsdCompanyProfileExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdCompanyProfile mlsdCompanyProfile) {
		return mlsdCompanyProfileGeneratorMapper.updateByPrimaryKeySelective(mlsdCompanyProfile)> 0 ? true : false;
	}
}