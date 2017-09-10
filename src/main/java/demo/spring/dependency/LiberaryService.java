package demo.spring.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LiberaryService {
LiberaryDAO liberaryDAO;
@Autowired
public LiberaryService(LiberaryDAO liberaryDAO){
	this.liberaryDAO=liberaryDAO;
	
}
public LiberaryDAO getLiberaryDAO() {
	return liberaryDAO;
}

public void setLiberaryDAO(LiberaryDAO liberaryDAO) {
	this.liberaryDAO = liberaryDAO;
}



}
