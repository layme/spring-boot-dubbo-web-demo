package com.ziroom.demo;

import com.ziroom.demo.api.DemoService;
import com.ziroom.demo.dto.MetaFieldDto;
import com.ziroom.demo.dto.PageResultDto;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping(value = "list")
    public List<MetaFieldDto> list() {
        return this.demoService.selectAll();
    }

    @GetMapping(value = "listMaster")
    public List<MetaFieldDto> listMaster() {
        return this.demoService.selectAllFromMaster();
    }

    @GetMapping(value = "listSlave")
    public List<MetaFieldDto> listSlave() {
        return this.demoService.selectAllFromSlave();
    }

    @GetMapping(value = "page")
    public PageResultDto<MetaFieldDto> page(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        return this.demoService.selectByPage(page, limit);
    }
}
