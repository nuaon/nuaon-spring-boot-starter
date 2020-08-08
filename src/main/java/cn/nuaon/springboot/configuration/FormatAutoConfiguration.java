package cn.nuaon.springboot.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import cn.nuaon.springboot.format.FormatProcessor;
import cn.nuaon.springboot.format.JsonFormatProcessor;
import cn.nuaon.springboot.format.StringFormatProcessor;

@Configuration
public class FormatAutoConfiguration
{
    @Bean
    @Primary
    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    public FormatProcessor stringFormat()
    {
        return new StringFormatProcessor();
    }

    @Bean
    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    public FormatProcessor jsonFormat()
    {
        return new JsonFormatProcessor();
    }
}
