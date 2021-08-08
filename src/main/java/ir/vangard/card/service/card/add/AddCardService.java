package ir.vangard.card.service.card.add;

import ir.vangard.card.entity.Card;
import ir.vangard.card.repository.CardRepositoryInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AddCardService implements AddCardServiceInterface
{
    private final CardRepositoryInterface cardRepository;

    public AddCardService(CardRepositoryInterface cardRepository)
    {
        this.cardRepository = cardRepository;
    }

    @Override
    public Card add(Card card)
    {
        log.info("inside add card service");
        return this.cardRepository.save(card);
    }
}
