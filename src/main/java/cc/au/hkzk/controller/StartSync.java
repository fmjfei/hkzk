package cc.au.hkzk.controller;

import cc.au.hkzk.service.EmpCardSync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StartSync {

    @Autowired
    EmpCardSync ecs;

    @RequestMapping("/sync/{inp}/{tl}")
    @ResponseBody
    public String startSync(@PathVariable("inp")String inp,@PathVariable("tl") String tl){
        try {
            switch(inp) {
                case "lym":
                    return ecs.SyncZkData(0L);
                case "ttestt":
                    Long l = Long.parseLong(tl);
                    return ecs.SyncZkData(l);
                default:
                    return "Hi";
            }
        } catch(Exception e){
            return "Failed";
        }
    }

}
