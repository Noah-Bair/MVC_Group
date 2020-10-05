import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringController {
	private StringModel model;
	private StringView view;

	public StringController(StringView view, StringModel model) {
		this.view = view;
		this.model = model;

		this.view.combineListening(new StringListener());
		this.view.reverseListening(new StringListener());
	}

	class StringListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			String firstString, secondString, rString;

			if (event.getSource() == StringView.reverseButton) {
				rString = view.getrString();
				model.reverseString(rString);
				view.reverse(model.reverse());
			} else if (event.getSource() == StringView.combineButton) {
				firstString = view.getFirstString();
				secondString = view.getSecondString();
				model.StringCombine(firstString, secondString);
				view.combine(model.string_combined);
			}
		}
	}
}