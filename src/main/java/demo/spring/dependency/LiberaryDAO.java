package demo.spring.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LiberaryDAO {
	@Autowired
	private Liberary liberary;

	public Liberary getLiberary() {
		liberary.setlId("l12");
		liberary.setLibName("Sinha");
		liberary.setLibType("Science");
		liberary.getBooks().setBookID("ph12");
		liberary.getBooks().setBookName("Physics");
		liberary.getBooks().setBookAuthor("asdffg");
		liberary.getBooks().setBookType("phy");
		liberary.getBooks().setBookPrice("645");
		liberary.getBooks().setSubject("Science");
		liberary.getCategory().setCatId(12);
		liberary.getCategory().setCatName("Study");
		liberary.getCategory().setcType("ssfhh");
		return liberary;
	}

	public void setLiberary(Liberary liberary) {
		this.liberary = liberary;
	}

}
