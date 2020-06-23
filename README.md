# Mirai组件 Springboot快速启动器

[![](https://img.shields.io/badge/simple--robot-core-green)](https://github.com/ForteScarlet/simple-robot-core) [![img](https://camo.githubusercontent.com/f8464f5d605886b8369ab6daf28d7130a72fd80e/68747470733a2f2f696d672e736869656c64732e696f2f6d6176656e2d63656e7472616c2f762f696f2e6769746875622e466f727465536361726c65742f73696d706c652d726f626f742d636f7265)](https://search.maven.org/artifact/io.github.ForteScarlet/simple-robot-core) <br>[![](https://img.shields.io/badge/simple--robot-component--mirai-green)](https://github.com/ForteScarlet/simple-robot-component-mirai)  [![](https://img.shields.io/maven-central/v/love.forte.simple-robot-component/component-mirai)](https://search.maven.org/artifact/love.forte.simple-robot-component/component-mirai) <br>[![](https://img.shields.io/badge/simple--robot-core--springboot--starter-green)](https://github.com/ForteScarlet/simple-robot-core-springboot-starter) <br>[![](https://img.shields.io/badge/simple--robot-component--mirai--springboot--starter-green)](https://github.com/ForteScarlet/simple-robot-component-mirai-springboot-starter)[![](https://img.shields.io/maven-central/v/love.forte.simple-robot/component-mirai-spring-boot-starter)](https://search.maven.org/artifact/love.forte.simple-robot/component-mirai-spring-boot-starter) <br>[![](https://img.shields.io/badge/%E7%9C%8B%E4%BA%91%E6%96%87%E6%A1%A3-doc-green)](https://www.kancloud.cn/forte-scarlet/simple-coolq-doc)  [![](https://img.shields.io/badge/QQ%E7%BE%A4-782930037-blue)](https://jq.qq.com/?_wv=1027&k=57ynqB1)   

# 项目地址
[Github](https://github.com/ForteScarlet/simple-robot-component-cqhttp-springboot-starter) or [Gitee](https://gitee.com/ForteScarlet/simple-robot-component-cqhttp-springboot-starter)


## 使用
首先，引入依赖；
> https://search.maven.org/artifact/love.forte.simple-robot/component-mirai-spring-boot-starter

**Maven**
```xml
<dependency>
    <groupId>love.forte.simple-robot</groupId>
    <artifactId>component-mirai-spring-boot-starter</artifactId>
    <version>${version}</version>
</dependency>
```
**Gradle**

```
implementation 'love.forte.simple-robot:component-mirai-spring-boot-starter:${version}'
```

然后编写好配置类（与Springboot公用一个`application.properties`配置类）后启动即可。
例如：
```properties
# simbot的包扫描路径
simbot.core.scannerPackage=com.bot.listener
# ${账号1}:${密码1},${账号2}:${密码2}...
simbot.core.bots=111111:abcdefg
```

```java
@SpringBootApplication
public class RunApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
}
```


## 核心启动器

每一个组件启动器中一般来说都包含一个核心启动器。

正常情况下，你无需手动导入此坐标。

核心启动器的坐标为：

> 仓库地址：https://search.maven.org/artifact/io.github.ForteScarlet.simple-robot/core-spring-boot-starter

```xml
<dependency>
    <groupId>io.github.ForteScarlet.simple-robot</groupId>
    <artifactId>core-spring-boot-starter</artifactId>
    <version>${version}</version>
</dependency>
```

但是，假如：组件启动器的版本为`1.9.1`，而**前缀同为**`1.9`的核心启动器的最新一个版本是`1.9.2`，那么你可以选择手动导入这个更新一个版本的核心来升级内部的核心启动器。



## 其他链接


#### 核心

https://github.com/ForteScarlet/simple-robot-core

#### Mirai组件

https://github.com/ForteScarlet/simple-robot-component-mirai

#### 核心Springboot启动器

https://github.com/ForteScarlet/simple-robot-core-springboot-starter

# 更新日志
查看 [UPDATE.md](./UPDATE.md) 文件