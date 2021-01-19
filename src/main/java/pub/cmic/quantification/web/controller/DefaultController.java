package pub.cmic.quantification.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author yumiao
 */
@RestController
public class DefaultController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject index(){
        var response = new JSONObject();
        response.put("result", "...");
        return response;
    }
}
