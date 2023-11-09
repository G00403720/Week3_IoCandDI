package ie.atu.week3;

import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    public String ackMessage(Book user){
        String message = "Thank you" + user.getTitle() + "Your request has been recieved";
        String message1 = "Thank you" + user.getAuthor() + "Your request has been recieved";
        String message2 = "Thank you" + user.getIsbn() + "Your request has been recieved";
        String message3 = "Thank you" + user.getPublishedYear() + "Your request has been recieved";
        return message;
    }

    public String getTitle(){
        return "Title";
    }
    public String getAuthor(){

        return "Author";
    }
    public String getIsbn(){
        return "Isbn";
    }
    public String getPublishedYear(){

        return "PublishedYear";
    }
}
