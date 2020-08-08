package cn.nuaon.springboot.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import cn.nuaon.springboot.format.FormatProcessor;
import cn.nuaon.springboot.template.FormatTemplate;

@Configuration
@EnableConfigurationProperties(NuaonProperties.class)
@Import(FormatAutoConfiguration.class)
public class AutoConfiguration
{
    @Bean
    public FormatTemplate formatTemplate(FormatProcessor processor)
    {
        return new FormatTemplate(processor);
    }
}
