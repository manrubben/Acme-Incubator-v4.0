
package acme.features.entrepreneur.investmentRounds;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.InvestmentRound;
import acme.entities.roles.Entrepreneur;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface EntrepreneurInvestmentRoundsRepository extends AbstractRepository {

	@Query("select j from InvestmentRound j where j.id = ?1")
	InvestmentRound findOneById(int id);

	@Query("select e from Entrepreneur e where e.id = ?1")
	Entrepreneur findEmployerById(int entrepenaurId);

	@Query("select j from InvestmentRound j where j.entrepreneur.id =?1")
	Collection<InvestmentRound> findManyByEntrepreneurId(int entrepenaurId);

}
