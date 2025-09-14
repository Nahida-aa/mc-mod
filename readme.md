# xaa and Nahida-aa 的第一个 mc mod

https://docs.fabricmc.net/

## use guide

```sh
./gradlew runClient
```

## Introduction

### install

- [Fabric](https://fabricmc.net/)

在 https://fabricmc.net/develop/template/ 生成一个项目模板

## 文件结构

## item

diamond

## version manage

```sh
# create a tag for the current commit
git tag v-0.0.1_mc-1.20.1
# push the tag to the remote repository
git push origin v-0.0.1_mc-1.20.1
# 创建一个新的分支，基于 v-0.0.1_mc-1.20.1
git checkout -b mc/1.21.4 v-0.0.1_mc-1.20.1
```

### 更新 Gradle 配置
修改 [`./gradle.properties`](./gradle.properties) 文件：

```properties
# 更新 Minecraft 版本
minecraft_version=1.21.4

# 更新映射版本（访问 https://fabricmc.net/develop/ 获取最新）
yarn_mappings=1.21.4+build.1

# 更新 Fabric Loader 版本
fabric_loader_version=0.15.7

# 更新 Fabric API 版本（检查 https://modrinth.com/mod/fabric-api）
fabric_api_version=0.98.0+1.21.4
```
更新 [`./build.gradle`](./build.gradle) 文件：

```groovy
dependencies {
    // 更新 Fabric API (通常不需要修改)
    modImplementation "net.fabricmc.fabric-api:fabric-api:${project.fabric_version}"
    
    // 其他依赖可能需要更新
    // modImplementation "com.example:mod:1.2.0"
}
```

### 生成新版本源代码

```sh
# 清理旧版本构建
./gradlew clean

# 生成 1.21.4 的源代码
./gradlew genSources
```
