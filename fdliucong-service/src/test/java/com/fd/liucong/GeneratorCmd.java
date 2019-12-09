package com.fd.liucong;

import com.fd.liucong.generator.GeneratorEntity;
import com.fd.liucong.generator.GeneratorService;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.io.File;

/**
 * 实体类代码生成
 **/
public class GeneratorCmd {

    @Test
    public void generate() {
        String javaPath = "src/main/java";
        String resPath = "src/main/resources";
        String[] tablesDB = {
                "ai_business"
        };
        String[] tablePrefix = {"ai", "trip"};

        //生成实体
        GeneratorEntity generatorEntity = new GeneratorEntity()
                .setDbUrl("jdbc:mysql://39.130.160.127:3306/konggang_zxshows?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&useSSL=false")
                .setDbUserName("konggang_zxshows")
                .setDbPassword("HY7X7x8FZNe7y5dM")
                .setPackageName("com.fd.liucong")
                .setJavaPath(new File(getProjectDir("fdliucong-common"), javaPath).getPath());
        generatorEntity.generateByTables("", tablesDB, tablePrefix);

        //生成seivice
        GeneratorService generatorService = new GeneratorService()
                .setDbUrl("jdbc:mysql://39.130.160.127:3306/konggang_zxshows?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&useSSL=false")
                .setDbUserName("konggang_zxshows")
                .setDbPassword("HY7X7x8FZNe7y5dM")
                .setPackageName("com.fd.liucong")
                .setJavaPath(new File(getProjectDir("fdliucong-service"), javaPath).getPath())
                .setResPath(new File(getProjectDir("fdliucong-service"), resPath).getPath());
        generatorService.setEntityPackageName("com.fd.liucong");
        generatorService.generateByTables("", tablesDB, tablePrefix);
    }

    @NotNull
    public File getProjectDir(String projectName) {
        return new File(new File("").getAbsoluteFile().getParentFile(), projectName);
    }
}
