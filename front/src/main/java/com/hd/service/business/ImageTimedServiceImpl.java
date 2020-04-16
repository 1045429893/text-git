package com.hd.service.business;

import com.hd.api.business.TimedTaskService;
import com.hd.api.generator.*;
import com.hd.common.utils.SystemEnvUtil;
import com.hd.dao.business.CleanImageTaskBusinessMapper;
import com.hd.entity.business.ConstantPoll;
import com.hd.entity.generator.*;
import com.hd.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.*;


/**
 * @Description: 定时任务
 * @Author: shangYuRen
 * @CreateDate: 2019/10/12 13:53
 */
@Service
public class ImageTimedServiceImpl implements TimedTaskService {
    @Autowired
    MlsdHomePageGeneratorService mlsdHomePageGeneratorService;
    @Autowired
    MlsdBrandCultureGeneratorService mlsdBrandCultureGeneratorService;
    @Autowired
    MlsdItemAdvantageGeneratorService mlsdItemAdvantageGeneratorService;
    @Autowired
    MlsdJoinInvestmentGeneratorService mlsdJoinInvestmentGeneratorService;
    @Autowired
    MlsdProductPresentationGeneratorService mlsdProductPresentationGeneratorService;
    @Autowired
    MlsdStoreDisplayGeneratorService mlsdStoreDisplayGeneratorService;
    @Autowired
    MlsdStrengthGeneratorService mlsdStrengthGeneratorService;
    @Autowired
    MlsdContactUsGeneratorService mlsdContactUsGeneratorService;
    @Autowired
    MlsdIntendedUsersGeneratorService mlsdIntendedUsersGeneratorService;
    @Autowired
    MlsdContactMessageGeneratorService mlsdContactMessageGeneratorService;
    @Autowired
    MlsdCompanyProfileGeneratorService mlsdCompanyProfileGeneratorService;
    @Autowired
    MlsdOnlineServiceGeneratorService mlsdOnlineServiceGeneratorService;
    @Autowired
    CleanImageTaskBusinessMapper cleanImageTaskBusinessMapper;
    @Override
    public void cleanImage() {
        /**
         * @Description: 清理图片
         * @Author: shangYuRen
         * @CreateDate: 2019/10/12 14:01
         */
        //front 文件存储路径（环境变量中获取）
        String path = SystemEnvUtil.getSystemEnv("mlsd_front_pic_path");
        //1.遍历数据库 查找所有正在使用的图片名称
        List<String> currentlyInUseNamesList = new ArrayList<>();//
        //遍历查询map数据
        Map<String,Object> queryMap=new HashMap<>();
        queryMap.put("mlsdId",ConstantPoll.MLSD);
        //查询结果
        List<Map<String, Object>> findImageNamesByIdMapListDB = cleanImageTaskBusinessMapper.findImageNamesById(queryMap);
       //遍历 数据库查询结果
        for (Map<String, Object> mapDB:findImageNamesByIdMapListDB ) {
            //判断
            for (String key :mapDB.keySet()) {
                File file = new File(path+mapDB.get(key).toString());
                boolean b = file.exists();
                if(b){
                    currentlyInUseNamesList.add(mapDB.get(key).toString());
                }
            }
        }
        //2. 遍历硬盘文件夹，查找文件夹下所有有文件(路径下全部文件名称)
        List<String> allFilesUnderThePathFileNames = new ArrayList<>();
        FileUtil.findFileNamesList(new File(path),allFilesUnderThePathFileNames );
        //3 比对 当前正在使用的信息 集合与 文件内文件信息 集合 取差集
        allFilesUnderThePathFileNames.removeAll(currentlyInUseNamesList);
        //4.删除：根据差集 删除对应文件
        for (int i = 0; i < allFilesUnderThePathFileNames.size(); i++) {
            File file=new File(path+allFilesUnderThePathFileNames.get(i));
            file.delete();

        }
    }
}