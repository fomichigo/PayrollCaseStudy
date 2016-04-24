package hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.adapters.primary.ui.views_and_controllers.dialog.addtimecard;

import hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.adapters.primary.ui.views_and_controllers.UI;
import hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.adapters.primary.ui.views_and_controllers.dialog.addtimecard.AddTimeCardController.AddTimeCardControllerFactory;

public abstract class AddTimeCardUI<V extends AddTimeCardView> extends UI<V, AddTimeCardController> {
	
	public AddTimeCardUI(
			AddTimeCardControllerFactory controllerFactory,
			int employeeId
			) {
		super(controllerFactory.create(employeeId));
	}
	
	public abstract void show();
	
	public interface AddTimeCardUIFactory {
		AddTimeCardUI<? extends AddTimeCardView> create(int employeeId);
	}
	
}
