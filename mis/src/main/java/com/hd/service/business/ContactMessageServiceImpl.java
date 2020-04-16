package com.hd.service.business;

import com.hd.api.business.ContactMessageService;
import com.hd.api.generator.MlsdContactMessageGeneratorService;
import com.hd.common.utils.ServiceRetCode;
import com.hd.common.utils.TimeUtils;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.business.ContactMessageVo;
import com.hd.entity.business.RetCodeAndMessage;
import com.hd.entity.generator.MlsdContactMessage;
import com.hd.entity.generator.MlsdContactMessageExample;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactMessageServiceImpl implements ContactMessageService {

    @Autowired
    MlsdContactMessageGeneratorService mlsdContactMessageGeneratorService;

    @Override
    public Object[] getContactMessageList(Integer page, Integer pageSize, String isRead, String userName, String tel) {
        List<ContactMessageVo> contactMessageListVo = new ArrayList<>();
        MlsdContactMessageExample mlsdContactMessageExample = new MlsdContactMessageExample();
       MlsdContactMessageExample.Criteria mlsdContactMessageExampleCriteria= mlsdContactMessageExample.createCriteria();
        mlsdContactMessageExample.setPage(page, pageSize);
        mlsdContactMessageExample.setOrderByClause("create_time desc");
        Integer contactMessageCount = mlsdContactMessageGeneratorService.countByExample(mlsdContactMessageExample);
        if (!StringUtils.isBlank(isRead)) {
            mlsdContactMessageExampleCriteria.andIsReadEqualTo(isRead);
        }
        if (!StringUtils.isBlank(userName)) {
            mlsdContactMessageExampleCriteria.andUserNameLike("%"+userName+"%");
        }
        if (!StringUtils.isBlank(tel)) {
            mlsdContactMessageExampleCriteria.andTelLike("%"+tel+"%");
        }
        List<MlsdContactMessage> mlsdContactMessageListDB = mlsdContactMessageGeneratorService.selectByExample(mlsdContactMessageExample);
        if (mlsdContactMessageListDB != null) {
            for (MlsdContactMessage contactMessageDB : mlsdContactMessageListDB) {
                ContactMessageVo contactMessageVo = new ContactMessageVo();
                contactMessageVo.setContactMessageId(contactMessageDB.getId().toString());
                contactMessageVo.setAddress(contactMessageDB.getAddress() == null ? "" : contactMessageDB.getAddress());
                contactMessageVo.setContent(contactMessageDB.getContent() == null ? "" : contactMessageDB.getContent());
                contactMessageVo.setEmail(contactMessageDB.getEmail() == null ? "" : contactMessageDB.getEmail());
                contactMessageVo.setTel(contactMessageDB.getTel() == null ? "" : contactMessageDB.getTel());
                contactMessageVo.setUserName(contactMessageDB.getUserName() == null ? "" : contactMessageDB.getUserName());
                contactMessageVo.setCreateTime(contactMessageDB.getCreateTime() == null ? "" : TimeUtils.convertDateToString(contactMessageDB.getCreateTime(), TimeUtils.FORMAT1));
                contactMessageVo.setIsRead(contactMessageDB.getIsRead() == null ? "" : contactMessageDB.getIsRead().toString());
                contactMessageVo.setIsReadStr(ConstantPoll.getIsReaderStr(contactMessageVo.getIsRead()));
                contactMessageListVo.add(contactMessageVo);
            }
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS, contactMessageListVo, contactMessageCount);
    }


    @Override
    @Transactional
    public Object[] updateContactMessage(MlsdContactMessage mlsdContactMessage) {
        if (!mlsdContactMessageGeneratorService.updateByPrimaryKeySelective(mlsdContactMessage)) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ServiceRetCode.returnCode(RetCodeAndMessage.COMPANY_UPDATE_FAIL);
        }
        return ServiceRetCode.returnCode(RetCodeAndMessage.SUCCESS);
    }

}
