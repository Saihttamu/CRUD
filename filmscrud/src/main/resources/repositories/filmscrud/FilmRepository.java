package filmscrud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long>{
	Film findByTitle(String title);
	
	@Override
	void delete(Film film);
}
