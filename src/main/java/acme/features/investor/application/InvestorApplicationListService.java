
package acme.features.investor.application;

import org.springframework.stereotype.Service;

import acme.entities.Application;
import acme.entities.roles.Investor;
import acme.framework.services.AbstractService;

@Service
public class InvestorApplicationListService implements AbstractService<Investor, Application> {

}
