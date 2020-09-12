# Mirai组件 Springboot快速启动器


[![](https://img.shields.io/badge/simple--robot-component--mirai--springboot--starter-green)](https://github.com/ForteScarlet/simple-robot-component-mirai-springboot-starter) [![](https://img.shields.io/maven-central/v/love.forte.simple-robot/component-mirai-spring-boot-starter)](https://search.maven.org/artifact/love.forte.simple-robot/component-mirai-spring-boot-starter) 
<br>
[![](https://img.shields.io/badge/%E7%9C%8B%E4%BA%91%E6%96%87%E6%A1%A3-doc-green)](https://www.kancloud.cn/forte-scarlet/simple-coolq-doc)  [![](https://img.shields.io/badge/QQ%E7%BE%A4-782930037-blue)](https://jq.qq.com/?_wv=1027&k=57ynqB1)   

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

## kotlin
从mirai的`v1.2.0`开始，便使用了`1.4.0`版本的`kotlin`和`1.3.9`版本的`kotlinx-coroutines`。
如果你出现了类似于`NoClassDefFoundError`的错误且找不到的类是`kotlin`下的东西，例如`kotlin/coroutines/EmptyCoroutineContext`，
则请尝试手动导入`1.4.10`版本的`kotlin`

以maven为例：
```xml
       <dependency>
           <groupId>org.jetbrains.kotlin</groupId>
           <artifactId>kotlin-stdlib-jdk8</artifactId>
           <version>${kotlin.version}</version>
       </dependency>
       <!-- kt -->
       <dependency>
           <groupId>org.jetbrains.kotlin</groupId>
           <artifactId>kotlin-stdlib</artifactId>
           <version>${kotlin.version}</version>
       </dependency>
        <!-- ktx coroutines core -->
        <dependency>
            <groupId>org.jetbrains.kotlinx</groupId>
            <artifactId>kotlinx-coroutines-core</artifactId>
            <version>${kotlinx-coroutines-core.version}</version>
        </dependency>
```

其中，`${kotlin.version}` 为 `1.4.10`, `${kotlinx-coroutines-core.version}`为`1.3.9`.




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