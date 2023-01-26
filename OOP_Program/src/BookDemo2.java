import javax.swing.JOptionPane;

public class BookDemo2 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author email:");
		String title = JOptionPane.showInputDialog("Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		Book1 book = new Book1(title, new Author1(name, email), page);
		int chk = JOptionPane.showConfirmDialog(null, "Is the page correct?", "Confirm", JOptionPane.YES_NO_OPTION);
		if (chk == 1) {
			
			book.setPage(Integer.parseInt(JOptionPane.showInputDialog("Input book page,again:")));
			JOptionPane.showMessageDialog(null, "BookTitle:"+book.getTitle()+
					"\nAuthor name:"+book.getAuthor().getName()+"("+book.getPage()+" page)"
					+"\nAuthor email:"+book.getAuthor().getEmail());
			
		} else {
			JOptionPane.showMessageDialog(null, "BookTitle:"+book.getTitle()+
					"\nAuthor name:"+book.getAuthor().getName()+"("+book.getPage()+" page)"
					+"\nAuthor email:"+book.getAuthor().getEmail());

		}
	}
}
