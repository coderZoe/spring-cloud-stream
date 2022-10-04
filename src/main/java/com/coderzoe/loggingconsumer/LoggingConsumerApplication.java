package com.coderzoe.loggingconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author 90617
 */
@SpringBootApplication
public class LoggingConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoggingConsumerApplication.class, args);
    }

    /**
     * 模块1 生产字符串
     */
    @Bean
    public Supplier<String> produceStr(){
        return () -> "hello spring cloud stream";
    }

    /**
     * 模块2，将生产的字符串转为大写
     */
    @Bean
    public Function<String,String> upperCase(){
        return String::toUpperCase;
    }

    /**
     * 模块3 将字符串打印
     */
    @Bean
    public Consumer<String> log(){
        return System.out::println;
    }

}
