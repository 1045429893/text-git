package com.hd.util;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class FileUtil {
    public static void main(String[] args) throws Exception {
        List<String> fileNames = new ArrayList<>();
        FileUtil.findFileList(new File("D:\\Java workspace\\2019WorkSqace\\server_mlsd\\front\\target\\ROOT\\pic\\"),fileNames );
        System.out.println();
        int no=1;
        for (String value :  fileNames) {
            System.out.println("file("+no+"):"+value);
            no++;
        }
    }


    /**
     * 读取目录下的所有文件(包含绝对路径)
     * @param dir 目录
     * @param fileNames 保存文件名的集合
     * @return
     */
    public static void findFileList(File dir, List<String> fileNames) {
        if (!dir.exists() || !dir.isDirectory()) {// 判断是否存在目录
            return;
        }
        String[] files = dir.list();// 读取目录下的所有目录文件信息
        for (int i = 0; i < files.length; i++) {// 循环，添加文件名或回调自身
            File file = new File(dir, files[i]);
            if (file.isFile()) {// 如果文件
                fileNames.add(dir + "\\" + file.getName());// 添加文件全路径名
            } else {// 如果是目录
                findFileList(file, fileNames);// 回调自身继续查询
            }
        }
    }


    /**
     * 读取目录下的所有文件（仅文件名称）
     * @param dir 目录
     * @param fileNames 保存文件名的集合
     * @return
     */
    public static void findFileNamesList(File dir, List<String> fileNames) {
        if (!dir.exists() || !dir.isDirectory()) {// 判断是否存在目录
            return;
        }
        String[] files = dir.list();// 读取目录下的所有目录文件信息
        for (int i = 0; i < files.length; i++) {// 循环，添加文件名或回调自身
            File file = new File(dir, files[i]);
            if (file.isFile()) {// 如果文件
                fileNames.add( file.getName());
            } else {// 如果是目录
                findFileNamesList(file, fileNames);// 回调自身继续查询
            }
        }
    }


}
