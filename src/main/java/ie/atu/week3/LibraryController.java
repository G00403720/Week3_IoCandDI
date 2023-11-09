package ie.atu.week3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    private LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService){
        this.libraryService = libraryService;
    }
    public void setLibraryService(LibraryService libraryService){
        this.libraryService = libraryService = libraryService;
    }

    public String saySomething(){
        return libraryService.getTitle();
    }
    public String saySomething2(){
        return libraryService.getAuthor();
    }
    public String saySomething3(){
        return libraryService.getIsbn();
    }
    public String saySomething4(){
        return libraryService.getPublishedYear();
    }

    @PostMapping("/confirm")
    public String confirm(@RequestBody Book book){
        return libraryService.ackMessage(book);
    }
}
