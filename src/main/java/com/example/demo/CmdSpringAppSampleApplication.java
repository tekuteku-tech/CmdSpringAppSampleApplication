package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CmdSpringAppSampleApplication {

    public static void main(String[] args) {

        try {
            // Spring アプリケーションを実行し、コンテクストを取得する
            ConfigurableApplicationContext context = SpringApplication.run(CmdSpringAppSampleApplication.class, args);

            // Springのコンテナを終了させる
            int springExitCode = SpringApplication.exit(context, () -> 0);

            // Java VMも終了させる
            System.exit(springExitCode);

        } catch (Exception e) {

            e.printStackTrace();
            System.exit(1);

        }

    }

}
