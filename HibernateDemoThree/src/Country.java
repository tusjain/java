import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="COUNTRY")
public class Country {
 
	@Id
	@GeneratedValue
	@Column(name="Country_Id")
	int countryId;
	
	@Column(name="Country_Name")
    String countryName ;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="COUNTRY_LANGUAGE",joinColumns={@JoinColumn(name="Country_Id")},inverseJoinColumns={@JoinColumn(name="Language_Id")})
	Collection<Language> languages=new ArrayList<Language>();
    
	public Country()
	{
		
	}
    public Country(String countryName) {
		this.countryName=countryName;
	}

	public String getCountryName() {
        return countryName;
    }
          
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

	public Collection<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<Language> languages) {
		this.languages = languages;
	}
}

