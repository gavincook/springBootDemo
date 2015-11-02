# springBootDemo
Spring boot和MySQL结合示例。数据库配置在`application.properties`中。

### 启动步骤：
1. 修改`application.properties`中的数据库用户信息为有效的信息

2. 保证数据库(sample)已经创建，可使用如下命令创建：
```
CREATE DATABASE IF NOT EXISTS sample DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
```

3. 运行

* 第一种方式
   IDE启动，将源码导入项目，然后执行`Application`类即可

* 第二种方式
   打包部署。在项目根目录执行：`mvn clean package` ，构建成功后，会在项目根目录的target文件夹下创建：`springboot-1.0.0.jar` 。使用命令：`java -jar springboot-1.0.0.jar`启动应用