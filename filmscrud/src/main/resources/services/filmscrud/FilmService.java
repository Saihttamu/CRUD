package filmscrud;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.tools.javac.util.List;

@Service
public class FilmService {
	private FilmRepository filmRepo;
	
	@Autowired
	public FilmService(FilmRepository filmRepo) {
		this.filmRepo = filmRepo;
	}
	
	@Transactional
	public List<Film> findAll() {
		this.filmRepo.findAll();
	}
}
