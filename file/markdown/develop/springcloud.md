#微服务架构核心关键点
1. 微服务治理
    ```text
    服务治理是SpringCloud的核心
    两个选择
       Consul
       Eureka(Netflix)
    spring cloud eureka是Spring Cloud 对Netflix开源的一款服务治理产品进行二次封装而出现的一个子项目
    ```
    1. 服务注册
    1. 服务发现
    1. 服务注销
    1. 服务状态监控
    1. 负载均衡
    
1. 微服务网关
    1. 微服务映射
    1. 服务路由管理
    1. 请求过滤
    1. AB测试
    1. 金丝雀测试
1. 微服务容错
    1. 服务降级
    1. 熔断机制
    1. 超时管理
    1. 回退机制
    1. 服务限流
1. 统一配置
    1. 加载与刷新
    1. 配置存储
    1. 版本管理
    1. 加密与解密
1. 微服务监控
    1. 日志聚合
    1. 日志监控
    1. 调用链监控
    1. 可视化分析
    1. 健康检查
    1. Metrics监控
1. 微服务通信
    1. 基于RESTful协议
    1. 消息中间件整合
    1. 发布-订阅模式
    1. 远程事件
1. 微服务安全
    1. Session管理
    1. 单点登录
    1. OAuth认证
    1. JWT授权
1. 微服务部署与编排
    1. Docker
    1. K8s
    1. 服务编排
    1. 自动发布
#Spring Cloud 技术概览
```text
Spring Cloud是在Netflix OSS等多家开源的基础上，使用SpringBoot风格将这些比较成熟的微服务框架组合起来，屏蔽掉复杂的配置和实现原理
为快速构建微服务机构的应用提供了一套基础设施工具和开发支持
```
1. 基于Netflix实现服务治理、客户端负载均衡、声明式调用
1. 服务网关
1. 微服务容错管理
1. 整合消息中间件提供消息驱动式开发
1. 基于SpringSecurity提供微服务安全、单点登录功能
1. 分布式、版本化的统一配置管理
1. 微服务调用链及追踪管理
##Spring Cloud子项目
- 对现有成熟的第三方开源项目SpringBoot化，开箱即用
- 新增一些微服务机构开发所需的基础设施
    1. Spring Cloud Config统一配置中心
    1. Spring Cloud Stream快速集成Kafka，RabbitMQ等消息中间件