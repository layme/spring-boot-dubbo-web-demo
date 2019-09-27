package com.ziroom.demo;

import com.ziroom.demo.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
 * @date Created in 2019年09月26日 16:11
 * @since 1.0
 */
@RestController
@RequestMapping(value = "/api")
public class DemoController {
    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping(value = "/hello")
    public String demoMethod(String name) {
        return this.demoService.sayHello(name);
    }
}
