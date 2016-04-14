package hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.adapters.primary.ui.impl.swing.viewimpl.component;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.adapters.primary.ui.impl.swing.viewimpl.util.SpringUtilities;

public class FieldsPanel extends JPanel {
	private int fieldCount = 0;
	
	public FieldsPanel() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new SpringLayout());
	}

	public void addField(String labelText, JComponent component) {
		JLabel jLabel = new JLabel(labelText, JLabel.TRAILING);
		jLabel.setLabelFor(component);
		add(jLabel);
		add(component);
		fieldCount++;
	}
	
	public void makeCompactGrid() {
		SpringUtilities.makeCompactGrid(this,
		                                fieldCount , 2, //rows, cols
		                                6, 6,        //initX, initY
		                                6, 6);       //xPad, yPad
	}
	
}
