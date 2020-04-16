package com.hd.service.business;

import com.hd.api.business.ContactMessageService;
import com.hd.api.business.IntendedUsersService;
import com.hd.api.generator.MlsdContactMessageGeneratorService;
import com.hd.api.generator.MlsdIntendedUsersGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.common.utils.TimeUtils;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.ContactMessageVo;
import com.hd.entity.business.IntendedUsersVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdContactMessage;
import com.hd.entity.generator.MlsdContactMessageExample;
import com.hd.entity.generator.MlsdIntendedUsers;
import com.hd.entity.generator.MlsdIntendedUsersExample;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;
import java.util.List;

@Service
public class IntendedUsersServiceImpl implements IntendedUsersService {

    @Autowired
    MlsdIntendedUsersGeneratorService mlsdIntendedUsersGeneratorService;

    @Override
    public Object[] getIntendedUsersList(Integer page, Integer pageSize, String startTime, String endTime) throws Exception {
        List<IntendedUsersVo> intendedUsersVoList = new ArrayList<>();
        MlsdIntendedUsersExample mlsdIntendedUsersExample = new MlsdIntendedUsersExample();
        MlsdIntendedUsersExample.Criteria intendedUsersExampleCriteria = mlsdIntendedUsersExample.createCriteria();
        mlsdIntendedUsersExample.setOrderByClause("create_time desc");
        Integer intendedUsersCount = mlsdIntendedUsersGeneratorService.countByExample(mlsdIntendedUsersExample);
        if (!StringUtils.isBlank(startTime) && StringUtils.isBlank(endTime)) {
            intendedUsersExampleCriteria.andCreateTimeGreaterThanOrEqualTo(TimeUtils.convertStringToDate(startTime));
        }else if (StringUtils.isBlank(startTime) && !StringUtils.isBlank(endTime)) {
            intendedUsersExampleCriteria.andCreateTimeLessThanOrEqualTo(TimeUtils.convertStringToDate(endTime));
        }else if(!StringUtils.isBlank(startTime) && !StringUtils.isBlank(endTime)){
            intendedUsersExampleCriteria.andCreateTimeBetween(TimeUtils.convertStringToDate(startTime),TimeUtils.convertStringToDate(endTime));
        }

        List<MlsdIntendedUsers> mlsdIntendedUsersListDB = mlsdIntendedUsersGeneratorService.selectByExample(mlsdIntendedUsersExample);
        if (mlsdIntendedUsersListDB != null) {
            for (MlsdIntendedUsers mlsdIntendedUsersDB : mlsdIntendedUsersListDB) {
                IntendedUsersVo intendedUsersVo=new IntendedUsersVo();
                intendedUsersVo.setUserName(mlsdIntendedUsersDB.getUserName() == null ? "" : mlsdIntendedUsersDB.getUserName());
                intendedUsersVo.setCreateTime(mlsdIntendedUsersDB.getCreateTime() == null ? "" : TimeUtils.convertDateToString(mlsdIntendedUsersDB.getCreateTime(), TimeUtils.FORMAT1));
                intendedUsersVo.setId(mlsdIntendedUsersDB.getId() == null ? "" : mlsdIntendedUsersDB.getId().toString());
                intendedUsersVo.setTel(mlsdIntendedUsersDB.getTel() == null ? "" : mlsdIntendedUsersDB.getTel());
                intendedUsersVoList.add(intendedUsersVo);
            }
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, intendedUsersVoList, intendedUsersCount);
    }
}
