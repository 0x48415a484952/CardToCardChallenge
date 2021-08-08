package ir.vangard.card.controller;

import ir.vangard.card.entity.Card;
import ir.vangard.card.service.card.add.AddCardServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card/add")
@Slf4j
public class AddCardController
{
    private final AddCardServiceInterface addCardService;

    public AddCardController(AddCardServiceInterface addCardService)
    {
        this.addCardService = addCardService;
    }

    @PostMapping()
    public Card addCard(@RequestBody Card card)
    {
        log.info("inside add service controller");
        return this.addCardService.add(card);
    }
}
