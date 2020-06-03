# learn-spring-cloud

各模块命名规则如下：  
**基础名称-[额外引入的特性，如果有的话]-端口号**  

如：  
eureka-2333为使用端口号2333的eureka模块；  
eureka-config-2333相比eureka-2333增加了向Config Server获取配置的特性；  
student-producer-hystrix-8848相比student-producer-8848增加了Hystrix断路器。

配置文件所在仓库为：[learn-spring-cloud-config](https://github.com/Yi1275432232/learn-spring-cloud-config)