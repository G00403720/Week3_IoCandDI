package ie.atu.week3;


import org.springframework.stereotype.Service;

@Service
public class AcknowledgeService {
    public String ackMessage(UserDetails user){
        String message = "Thank you" + user.getClass() + "your request has been received";
        return message;
    }
}
