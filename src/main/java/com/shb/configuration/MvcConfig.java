package com.shb.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by lukasz.homik on 2017-02-01.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.shb")
public class MvcConfig  {
}
