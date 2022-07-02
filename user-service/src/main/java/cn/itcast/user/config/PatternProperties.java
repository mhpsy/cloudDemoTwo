package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data //生成方法
@Component //注册到spring容器
@ConfigurationProperties(prefix = "mhpsy")
public class PatternProperties {
    private String id;
    private String name;
    private Integer age;
    private Integer sex;
}
    /*
    mhpsy:
    id: A001
    name: 赵善恩
    age: 20
    sex: 1
     */