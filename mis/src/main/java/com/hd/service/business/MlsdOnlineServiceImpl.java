package com.hd.service.business;

import com.hd.api.business.MlsdonLineServiceService;
import com.hd.api.generator.MlsdOnlineServiceGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.MlsdOnlineServiceVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigInteger;

@Service
public class MlsdOnlineServiceImpl implements MlsdonLineServiceService {


    @Autowired
    MlsdOnlineServiceGeneratorService mlsdOnlineServiceGeneratorService;

    @Override
    public Object[] getMlsdonline() {
        MlsdOnlineServiceVo mlsdOnlineServiceVo=new MlsdOnlineServiceVo();
        MlsdOnlineService mlsdOnlineServiceDB = mlsdOnlineServiceGeneratorService.selectByPrimaryKey(new BigInteger(ConstantPoll.MLSD_ID));
        if (mlsdOnlineServiceDB==null) {
            return ServiceRetCode.returnCode(RetCodeAndMessage.ONLINE_SERVICE_NOT_EXIST);
        }
        mlsdOnlineServiceVo.setId(mlsdOnlineServiceDB.getId() == null ? "" : mlsdOnlineServiceDB.getId().toString());
        mlsdOnlineServiceVo.setOnlineIconLeft(mlsdOnlineServiceDB.getOnlineIconLeft()==null?"":mlsdOnlineServiceDB.getOnlineIconLeft());
        mlsdOnlineServiceVo.setOnlineIconRight(mlsdOnlineServiceDB.getOnlineIconRight()==null?"":mlsdOnlineServiceDB.getOnlineIconRight());

        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, mlsdOnlineServiceVo);
    }

    @Override
    @Transactional
    public Object[] updateMlsdonline(MlsdOnlineService mlsdonlineService) {
        if (!mlsdOnlineServiceGeneratorService.updateByPrimaryKeySelective(mlsdonlineService)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.ONLINE_SERVICE_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }
}
