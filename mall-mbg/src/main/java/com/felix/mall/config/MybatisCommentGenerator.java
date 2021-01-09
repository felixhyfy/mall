package com.felix.mall.config;

import com.alibaba.druid.util.StringUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * @author Felix
 * @packageName com.felix.mall
 * @className MybatisCommentGenerator 配置注释
 * @description
 * @date 2021/1/9 19:57
 */
public class MybatisCommentGenerator extends DefaultCommentGenerator {
    private Properties properties;
    private Properties systemPro;
    private boolean suppressDate;
    private boolean suppressAllComments;
    private String currentDateStr;

    public MybatisCommentGenerator() {
        super();
        properties = new Properties();
        systemPro = System.getProperties();
        suppressDate = false;
        suppressAllComments = false;
        currentDateStr = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }

    /**
     * 对类的注解
     * @param topLevelClass
     * @param introspectedTable
     */
    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * 这是MyBatis Generator自动生成的Model Class.");

        StringBuilder sb = new StringBuilder();
        sb.append(" * 对应的数据表是 : ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        topLevelClass.addJavaDocLine(sb.toString());

        String tableRemarks = introspectedTable.getRemarks();
        if (!StringUtils.isEmpty(tableRemarks)) {
            sb.setLength(0);
            sb.append(" * 数据表注释 : ");
            sb.append(tableRemarks);
            topLevelClass.addJavaDocLine(sb.toString());
        }

        sb.setLength(0);
        sb.append(" * @author ");
        sb.append(systemPro.getProperty("user.name"));
        topLevelClass.addJavaDocLine(sb.toString());

        String curDateString = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date());
        sb.setLength(0);
        sb.append(" * @date ");
        sb.append(curDateString);
        topLevelClass.addJavaDocLine(sb.toString());

        topLevelClass.addJavaDocLine(" */");
    }

    /**
     * 生成的实体增加字段的中文注释
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
    }

}
