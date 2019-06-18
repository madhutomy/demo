package com.demo.controllers;


import com.demo.models.WordDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class WordReverser {

    @RequestMapping(value = "/api/v1/reverse", method = RequestMethod.POST)
    public void reverseWord(@RequestBody WordDTO wordDTO) {
        Optional<WordDTO> optionalWord = Optional.ofNullable(wordDTO);
        if (optionalWord.isPresent()) {
            Optional<String> optionalString  = Optional.ofNullable(optionalWord.get().getPhrase());
            if (optionalString.isPresent()) {
                System.out.println(optionalString);
            }
            else {
                System.out.println("Empty");
            }
        }
    }
}
