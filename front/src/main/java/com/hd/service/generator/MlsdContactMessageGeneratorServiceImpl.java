package com.hd.service.generator;

import java.util.List;
import com.hd.entity.generator.MlsdContactMessage;
import com.hd.entity.generator.MlsdContactMessageExample;
import org.springframework.stereotype.Service;
import java.math.BigInteger;
import com.hd.entity.generator.MlsdContactMessageKey;
import com.hd.dao.generator.MlsdContactMessageGeneratorMapper;
import com.hd.api.generator.MlsdContactMessageGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;



/**
*@author Robot
*/
@Service
public  class MlsdContactMessageGeneratorServiceImpl implements  MlsdContactMessageGeneratorService  {
    	
	@Autowired
	private MlsdContactMessageGeneratorMapper mlsdContactMessageGeneratorMapper;

	
	@Override
	public Integer countByExample(MlsdContactMessageExample mlsdContactMessageExample) {
		return mlsdContactMessageGeneratorMapper.countByExample(mlsdContactMessageExample);
	}

	@Override
    public List<MlsdContactMessage> selectByExample(MlsdContactMessageExample mlsdContactMessageExample) {
		return mlsdContactMessageGeneratorMapper.selectByExample(mlsdContactMessageExample);
	}

	@Override			
	public MlsdContactMessage selectByPrimaryKey(BigInteger primaryKey) {
		MlsdContactMessageKey mlsdContactMessageKey = new MlsdContactMessageKey();
		mlsdContactMessageKey.setId(primaryKey);
		return mlsdContactMessageGeneratorMapper.selectByPrimaryKey(mlsdContactMessageKey);
	}	

	@Override
	public MlsdContactMessage selectUnDelByPrimaryKey(BigInteger primaryKey) {
		MlsdContactMessageKey mlsdContactMessageKey = new MlsdContactMessageKey();
		mlsdContactMessageKey.setId(primaryKey);
		return mlsdContactMessageGeneratorMapper.selectUnDelByPrimaryKey(mlsdContactMessageKey);
	}

	@Override
    public boolean insertSelective(MlsdContactMessage mlsdContactMessage) {
	   return mlsdContactMessageGeneratorMapper.insertSelective(mlsdContactMessage)> 0 ? true : false;
	}

	@Override
    public boolean replaceSelective(MlsdContactMessage mlsdContactMessage) {
	   return mlsdContactMessageGeneratorMapper.replaceSelective(mlsdContactMessage)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByExample(MlsdContactMessageExample mlsdContactMessageExample) {
	   return mlsdContactMessageGeneratorMapper.deleteByExample(mlsdContactMessageExample)> 0 ? true : false;
	}

	@Override
    public boolean physicalDeleteByPrimaryKey(BigInteger primaryKey) {
		MlsdContactMessageKey mlsdContactMessageKey = new MlsdContactMessageKey();
		mlsdContactMessageKey.setId(primaryKey);
	   return mlsdContactMessageGeneratorMapper.deleteByPrimaryKey(mlsdContactMessageKey)> 0 ? true : false;
	 }


	@Override
    public boolean updateAllByExample(MlsdContactMessage mlsdContactMessage, MlsdContactMessageExample mlsdContactMessageExample) {
		return mlsdContactMessageGeneratorMapper.updateAllByExample(mlsdContactMessage,mlsdContactMessageExample)> 0 ? true : false;
	}

	@Override
    public boolean updateByPrimaryKeySelective(MlsdContactMessage mlsdContactMessage) {
		return mlsdContactMessageGeneratorMapper.updateByPrimaryKeySelective(mlsdContactMessage)> 0 ? true : false;
	}
}