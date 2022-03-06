# spring web & swagger3.0

## build.gradle

```kotlin
ext {
    set('webName', 'undertow') // 'tomcat' 'jetty' 'undertow'
}
//可以依赖 模块
implementation(project(":spring-web"))
// 可以发布到maven 依赖 jar
implementation("org.bougainvillea.spring:spring-web:${webName}.${springBootVersion}")
```

## application.yml

```yaml
spring:
  profiles:
    active: swagger
```
