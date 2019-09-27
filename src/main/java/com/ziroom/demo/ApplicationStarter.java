package com.ziroom.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author renhy
 * @version 1.0
 * @date Created in 2019年09月26日 16:13
 * @since 1.0
 */
@Slf4j
@SpringBootApplication
public class ApplicationStarter {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ApplicationStarter.class, args);
        String[] activeProfiles = context.getEnvironment().getActiveProfiles();
        for (String profile : activeProfiles) {
            log.info("current profile: {}", profile);
        }
    }
}
