package ir.vangard.card.controller;

import ir.vangard.card.entity.Card;
import ir.vangard.card.service.card.remove.RemoveCardServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card/remove")
@Slf4j
public class RemoveCardController
{

    private final RemoveCardServiceInterface removeCardService;

    public RemoveCardController(RemoveCardServiceInterface removeCardService)
    {
        this.removeCardService = removeCardService;
    }

    @DeleteMapping()
    public void remove(@RequestBody Card card)
    {
        log.info("inside remove card controller");
        this.removeCardService.remove(card);
    }
}
