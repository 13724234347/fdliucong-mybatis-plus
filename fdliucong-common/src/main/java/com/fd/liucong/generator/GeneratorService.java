
package com.fd.liucong.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.jetbrains.annotations.Nullable;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description service代码生成
 * @Author lc
 * @Date 2019/8/9 0009 下午 4:30
 */
public class GeneratorService {
    private String dbUrl;
    private String dbUserName;
    private String dbPassword;
    private String javaPath;
    private String resPath;
    private String packageName;
    private String entityPackageName;

    public GeneratorService() {
    }

    public GeneratorService setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public GeneratorService setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
        return this;
    }

    public GeneratorService setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }

    public GeneratorService setResPath(String resPath) {
        this.resPath = resPath;
        return this;
    }

    public GeneratorService setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    public GeneratorService setJavaPath(String javaPath) {
        this.javaPath = javaPath;
        return this;
    }

    public GeneratorService setEntityPackageName(String entityPackageName) {
        this.entityPackageName = entityPackageName;
        return this;
    }

    public void generateByTables(@Nullable final String moduleName, @Nullable String[] tableNames, @Nullable String[] tablePrefix) {
        String point_moduleName;
        if (moduleName != null && !moduleName.isEmpty()) {
            point_moduleName = "." + moduleName;
        } else {
            point_moduleName = "";
        }

        if (this.entityPackageName == null) {
            this.entityPackageName = this.packageName;
        }

        GlobalConfig config = new GlobalConfig();
        config.setOpen(false);
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL).setUrl(this.dbUrl).setUsername(this.dbUserName).setPassword(this.dbPassword).setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setTablePrefix(tablePrefix).setCapitalMode(true).setEntityLombokModel(false).setDbColumnUnderline(true).setNaming(NamingStrategy.underline_to_camel).setEntityBuilderModel(true).entityTableFieldAnnotationEnable(true).setInclude(tableNames);
        strategyConfig.entityTableFieldAnnotationEnable(true);
        config.setActiveRecord(false).setAuthor("generator").setOutputDir(this.javaPath).setEnableCache(false).setFileOverride(false);
        (new AutoGenerator()).setGlobalConfig(config).setDataSource(dataSourceConfig).setStrategy(strategyConfig).setPackageInfo((new PackageConfig()).setParent((String) null).setMapper(this.packageName + ".dao" + point_moduleName).setService(this.packageName + ".service" + point_moduleName).setServiceImpl(this.packageName + ".service.impl" + point_moduleName).setEntity(this.entityPackageName)).setTemplate((new TemplateConfig()).setController((String) null).setEntity((String) null).setXml((String) null)).setCfg((new InjectionConfig() {
            public void initMap() {
                Map<String, Object> map = new HashMap();
                this.setMap(map);
            }
        }).setFileOutConfigList(Collections.singletonList(new FileOutConfig("/templates/mapper.xml.vm") {
            public String outputFile(TableInfo tableInfo) {
                return GeneratorService.this.resPath + "/mapper/" + (StringUtils.isEmpty(moduleName) ? "" : moduleName + "/") + tableInfo.getEntityName() + "Mapper.xml";
            }
        }))).execute();
    }
}
