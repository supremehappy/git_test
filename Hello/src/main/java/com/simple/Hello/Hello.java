package com.simple.Hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    private static final Logger log = LoggerFactory.getLogger(Hello.class);

    @GetMapping("/hello")
    public String hello(){
        log.info("하와와와, Hello Get RestAPI인거예요");
        return "Hello World";
    }

    // new RestAPI Method by IntelliJ
    @GetMapping("/intelliJ")
    public String intelliJ(){
        log.info("하와와와, intelliJ에서 추가한 Get RestAPI인거예요");
        return "Hello World, intelliJ";
    }

    @GetMapping("/2ndintelliJ")
    public String secondIntelliJ(){
        log.info("하와와와, intelliJ에서 2번째로 추가한 Get RestAPI인거예요");
        return "Hello World, intelliJ Part 2!!";
    }

    // new RestAPI Method by VSCode
    @GetMapping("/vscode")
    public String vscode(){
        log.info("하와와와, VSCode에서 추가한 Get RestAPI인거예요");
        return "Hello World, VSCode";
    }

}
