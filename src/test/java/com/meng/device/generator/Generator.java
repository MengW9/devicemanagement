package com.meng.device.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: mybatis逆向工程    自动生成mybatis-Mapper工具
 * @author: WangMengWei
 * @create: 2019-09-11 08:58
 **/
public class Generator {

    /**
     * 目前在系统中本地环境使用local来配置mapper生成规则
     */
    //指定逆向工程配置文件
    private static final String config_url = "generatorConfig_local.xml";

    public void generator() throws Exception {
        List<String> warnings = new ArrayList<String>();
        ConfigurationParser cp = new ConfigurationParser(warnings);

        Configuration config = cp.parseConfiguration(Generator.class.getClassLoader().getResourceAsStream(config_url));

        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    /**
     * 主函数
     */
    public static void main(String[] args) throws Exception {
        try {
            Generator generatorSqlmap = new Generator();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("generator 执行成功!");
    }

}
