package ir.vangard.card.service.card.remove;

import ir.vangard.card.entity.Card;
import ir.vangard.card.repository.CardRepositoryInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RemoveCardService implements RemoveCardServiceInterface
{
    private final CardRepositoryInterface cardRepository;

    public RemoveCardService(CardRepositoryInterface cardRepository)
    {
        this.cardRepository = cardRepository;
    }

    public void remove(Card card)
    {
        log.info("inside remove card service");
        this.cardRepository.delete(card);
    }
}
