package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdIntendedUsers;
import com.hd.entity.generator.MlsdIntendedUsersExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdIntendedUsersKey;
import com.hd.dao.generator.MlsdIntendedUsersGeneratorMapper;
import com.hd.api.generator.MlsdIntendedUsersGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdIntendedUsersGeneratorServiceImpl implements  MlsdIntendedUsersGeneratorService  {
    	
	@Autowired
	private MlsdIntendedUsersGeneratorMapper mlsdIntendedUsersGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdIntendedUsersExample mlsdIntendedUsersExample) {
		return mlsdIntendedUsersGeneratorMapper.countByExample(mlsdIntendedUsersExample);
	}

	@Override
    public List<MlsdIntendedUsers> selectByExample(MlsdIntendedUsersExample mlsdIntendedUsersExample) {
		return mlsdIntendedUsersGeneratorMapper.selectByExample(mlsdIntendedUsersExample);
	}

	@Override			
	public MlsdIntendedUsers selectByPrimaryKey(BigInteger primaryKey) {
		MlsdIntendedUsersKey mlsdIntendedUsersKey = new MlsdIntendedUsersKey();
		mlsdIntendedUsersKey.setId(primaryKey);
		return mlsdIntendedUsersGeneratorMapper.selectByPrimaryKey(mlsdIntendedUsersKey);
	}	

	@Override
	public MlsdIntendedUsers selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdIntendedUsersKey mlsdIntendedUsersKey = new MlsdIntendedUsersKey();
		mlsdIntendedUsersKey.setId(primaryKey);
		return mlsdIntendedUsersGeneratorMapper.selectUnDelByPrimaryKey(mlsdIntendedUsersKey);
	}

	@Override
    public boolean insertSelective(MlsdIntendedUsers mlsdIntendedUsers) {
	   return mlsdIntendedUsersGeneratorMapper.insertSelective(mlsdIntendedUsers)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdIntendedUsers mlsdIntendedUsers) {
	   return mlsdIntendedUsersGeneratorMapper.replaceSelective(mlsdIntendedUsers)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdIntendedUsersExample mlsdIntendedUsersExample) {
	   return mlsdIntendedUsersGeneratorMapper.deleteByExample(mlsdIntendedUsersExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdIntendedUsersKey mlsdIntendedUsersKey = new MlsdIntendedUsersKey();
		mlsdIntendedUsersKey.setId(primaryKey);
	   return mlsdIntendedUsersGeneratorMapper.deleteByPrimaryKey(mlsdIntendedUsersKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdIntendedUsers mlsdIntendedUsers, MlsdIntendedUsersExample mlsdIntendedUsersExample) {
		return mlsdIntendedUsersGeneratorMapper.updateAllByExample(mlsdIntendedUsers,mlsdIntendedUsersExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdIntendedUsers mlsdIntendedUsers) {
		return mlsdIntendedUsersGeneratorMapper.updateByPrimaryKeySelective(mlsdIntendedUsers)> 0 ? true : false;
	}
}