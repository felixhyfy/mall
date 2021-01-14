package com.felix.mall;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Felix
 * @packageName com.felix.mall
 * @className Generator Mybatis生成器
 * @description
 * @date 2021/1/9 20:03
 */
public class Generator {

    public static void main(String[] args) throws Exception{
        //执行过程中的警告信息
        List<String> warnings = new ArrayList<>();
        //当生成代码重复，覆盖源代码
        boolean overwrite = true;
        //读取配置文件
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        //创建generator
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        //执行生成代码
        myBatisGenerator.generate(null);
        //输出警告
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
