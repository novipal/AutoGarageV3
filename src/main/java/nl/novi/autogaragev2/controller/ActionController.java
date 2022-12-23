package nl.novi.autogaragev2.controller;

import nl.novi.autogaragev2.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/actions")
public class ActionController {

    @Autowired
    private ActionService actionService;
}
