import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="LANGUAGE")
public class Language {

	@Id
	@GeneratedValue
	@Column(name="Language_Id")
	int languageId;
	
	@Column(name="Language_Name")
	String languageName;
	
	@ManyToMany(mappedBy="languages")
	Collection<Country> languageSpeakingCountries=new ArrayList<Country>();

	public Language()
	{
		
	}
	public Language(String languageName) {
		this.languageName=languageName;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public Collection<Country> getLanguageSpeakingCountries() {
		return languageSpeakingCountries;
	}

	public void setLanguageSpeakingCountries(ArrayList<Country> languageSpeakingCountries) {
		this.languageSpeakingCountries = languageSpeakingCountries;
	}
}
