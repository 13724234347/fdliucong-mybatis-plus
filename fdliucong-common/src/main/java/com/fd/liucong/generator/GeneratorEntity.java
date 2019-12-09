
package com.fd.liucong.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.jetbrains.annotations.Nullable;
import org.springframework.util.StringUtils;

/**
 * @Description 实体类代码生成
 * @Author lc
 * @Date 2019/8/9 0009 下午 4:30
 */
public class GeneratorEntity {
    private String dbUrl;
    private String dbUserName;
    private String dbPassword;
    private String javaPath;
    private String packageName;

    public GeneratorEntity() {
    }

    public GeneratorEntity setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public GeneratorEntity setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
        return this;
    }

    public GeneratorEntity setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }

    public GeneratorEntity setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    public GeneratorEntity setJavaPath(String javaPath) {
        this.javaPath = javaPath;
        return this;
    }

    public void generateByTables(@Nullable String moduleName, @Nullable String[] tableNames, @Nullable String[] tablePrefix) {
        GlobalConfig config = new GlobalConfig();
        config.setOpen(false);
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL).setUrl(this.dbUrl).setUsername(this.dbUserName).setPassword(this.dbPassword).setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setTablePrefix(tablePrefix).setCapitalMode(true).setEntityLombokModel(false).setDbColumnUnderline(true).setNaming(NamingStrategy.underline_to_camel).setEntityBuilderModel(true).entityTableFieldAnnotationEnable(true).setInclude(tableNames);
        config.setActiveRecord(false).setAuthor("generator").setOutputDir(this.javaPath).setFileOverride(true);
        (new AutoGenerator()).setGlobalConfig(config).setDataSource(dataSourceConfig).setStrategy(strategyConfig).setPackageInfo((new PackageConfig()).setParent(this.packageName).setEntity("entity" + (StringUtils.isEmpty(moduleName) ? "" : "." + moduleName)).setMapper("dao")).setTemplate((new TemplateConfig()).setXml((String) null).setController((String) null).setService((String) null).setServiceImpl((String) null).setMapper((String) null).setEntity("/templates/entity_swagger.java.vm")).execute();
    }
}
