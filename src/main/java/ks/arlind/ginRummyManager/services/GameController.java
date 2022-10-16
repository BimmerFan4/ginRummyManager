package ks.arlind.ginRummyManager.services;

import ks.arlind.ginRummyManager.model.Game;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GameController {
    @RequestMapping(
            value = "/configGame?{playersAmount}&{matchesAmount}",
            method = RequestMethod.GET
    )
    public Game startGame(
            @PathVariable("playersAmount") int playersAmount,
            @PathVariable("matchesAmount") int matchesAmount
    ) {
        System.out.println("Players Amount" + playersAmount);
        System.out.println("Matches Amount" + matchesAmount);
        return new Game();
    }

    @RequestMapping(
            value = "/test1",
            method = RequestMethod.GET
    )
    public String test(
    ) {
        return "TESTSETSETSETS";
    }
}
