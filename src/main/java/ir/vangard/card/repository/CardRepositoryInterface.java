package ir.vangard.card.repository;

import ir.vangard.card.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepositoryInterface extends JpaRepository<Card, Long>
{
}
