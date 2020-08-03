
package acme.features.entrepreneur.investmentRounds;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.components.CustomCommand;
import acme.entities.InvestmentRound;
import acme.entities.roles.Entrepreneur;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/entrepreneur/investmentround/")
public class EntrepreneurInvestmentRoundsController extends AbstractController<Entrepreneur, InvestmentRound> {

	@Autowired
	private EntrepreneurInvestmentRoundsListMineService	listMineService;

	@Autowired
	private EntrepreneurInvestmentRoundsShowService		showService;


	@PostConstruct
	private void initialise() {
		super.addCustomCommand(CustomCommand.LIST_MINE, BasicCommand.LIST, this.listMineService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);

	}

}
