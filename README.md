RPC 服务消费者容器和注册中心。

部署要求
    先启动test-register中的服务注册中心，
    然后启动test-rpcservice和Java Web框架测试项目。
    部署之前想mvn install项目，否则Java Web测试项
    目中会报错，domain-test中是rpc消费者和生产者公用
    POJO。