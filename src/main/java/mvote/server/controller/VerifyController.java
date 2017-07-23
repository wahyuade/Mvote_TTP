package mvote.server.controller;

import mvote.server.database_service.DptService;
import mvote.server.model.DptModel;
import mvote.server.model.VerifyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wahyuade on 20/07/17.
 */
@RestController
public class VerifyController {
    @Autowired
    private DptService dptService;
    VerifyModel data_verify;
    @PostMapping("/verify")
    public VerifyModel doVerify(@RequestPart String verify_code){

        try {
            DptModel data_dpt = dptService.findByVerifikasi(verify_code);
            if(data_dpt!= null){
                data_verify =  new VerifyModel(true,"Success Verify DPT", data_dpt);
            }else{
                data_verify = new VerifyModel(false,"Invalid verify code", null);
            }
        }catch (NullPointerException e){

        }
        return data_verify;

    }

}
