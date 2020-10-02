
public class MVCMain {

	public static void main(String[] args) {
		StringModel model = new StringModel();
		StringView view = new StringView();
		StringController controller = new StringController(view,model);
		
		view.setVisible(true);
	}

}
