package inline;

public class UrlCleaner2 {

	public String clean (String titulo) {
		
		String url = trimSpaces(titulo);
		return url;
	}

	private String removeSpecialChars(String url) {		
		return url.replaceAll(" ", "-");
	}
	
	private String trimSpaces(String url) {		
		return url.replaceAll("[.:,?]", "-");
	}
}
