package filmscrud;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity	
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	private String year;
	private String director;
	
	public Film() {
	}
	
	public Film(String title, String year, String director) {
		this.title    = title;
		this.year     = year;
		this.director = director;
	}
	
	public Film(String title, String year) {
		this.title    = title;
		this.year     = year;
	}
	
	public Film(String title) {
		this.title    = title;
	}
}
