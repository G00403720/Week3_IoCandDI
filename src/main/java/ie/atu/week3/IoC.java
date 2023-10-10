package ie.atu.week3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IoC {

    private final AcknowledgeService acknowledgeService;

    @Autowired
    public IoC(AcknowledgeService acknowledgeService){
        this.acknowledgeService = acknowledgeService;
    }
    @PostMapping("/confirm-and-register")
    public String confirmAndRegister(@RequestBody UserDetails userDetails){
        return acknowledgeService.ackMessage(userDetails);
    }

}
