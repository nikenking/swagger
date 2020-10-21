package com.dell.swagger.configer;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2//开启swagger2

public class SwaggerConfiger {
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Gaba");
    }
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Geba");
    }

    @Bean
    public Docket docket(Environment environment){
        boolean b = environment.acceptsProfiles(Profiles.of("dev", "somethingElse"));
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("Gabe")
                .enable(b)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dell.swagger.controller"))
                .build();
    }

    private ApiInfo apiInfo(){
        Contact contact = new Contact("郑创", "http://116.62.49.224:2333/", "15756217611@163.com");
        return new ApiInfo("第一次使用Swagger",
                "请多多关照",
                "1.0", "urn:tos", contact,
                "Apache 2.0",
                "http://116.62.49.224:2333/",
                new ArrayList()
        );
        /**
         * String version;
         * String title;
         * String description;
         * String termsOfServiceUrl;
         * String license;
         * String licenseUrl;
         * Contact contact;
         * List<VendorExtension> vendorExtensions;*/
    }


}
