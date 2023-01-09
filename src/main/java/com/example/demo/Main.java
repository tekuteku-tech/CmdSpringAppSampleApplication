package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Main implements ApplicationRunner {

    @Override

    public void run(ApplicationArguments args) throws Exception {

        System.out.println("ここに実行したい処理を書く");

        int counter = 1;
        for (String arg : args.getNonOptionArgs()) {
            System.out.println("引数" + counter + "：" + arg);
            counter++;
        }

    }

}
