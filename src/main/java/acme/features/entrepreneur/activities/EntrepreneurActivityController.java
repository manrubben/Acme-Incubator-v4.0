
package acme.features.entrepreneur.activities;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.components.CustomCommand;
import acme.entities.Activity;
import acme.entities.roles.Entrepreneur;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/entrepreneur/activity/")
public class EntrepreneurActivityController extends AbstractController<Entrepreneur, Activity> {

	@Autowired
	private EntrepreneurActivityListByInvestmentRoundService	listByInvestmentRoundService;

	@Autowired
	private EntrepreneurActivityShowService						showService;


	@PostConstruct
	private void initialise() {
		super.addCustomCommand(CustomCommand.LIST_BY_INVESTMENT_ROUNDS, BasicCommand.LIST, this.listByInvestmentRoundService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}

}
