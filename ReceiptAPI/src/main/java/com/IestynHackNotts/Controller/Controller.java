package com.IestynHackNotts.Controller;

import com.IestynHackNotts.Email;
import com.IestynHackNotts.Items;
import com.IestynHackNotts.Reciept;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.ArrayList;

@RestController
public class Controller {

    @GetMapping(value = "/reciept/json")
    public Reciept getRecieptJSON(@RequestBody ArrayList<Items> items){

        return new Reciept(items);
    }

    @GetMapping("/reciept/html")
    public String getRecieptHTML(){
        ArrayList<Items> items = new ArrayList<>();
        items.add(new Items("Chair",20.0));
        items.add(new Items("Table",20.0));

        return new Reciept(items).toHTML();
    }

    @PostMapping("/reciept/email")
    public void getRecieptEmail(@RequestBody ArrayList<Items> items, @RequestParam(value = "email", defaultValue = "iestyngage@gmail.com") String email) throws IOException, MessagingException {
        (new Email()).sendmail( new Reciept(items).toHTML(),email);

    }

}
