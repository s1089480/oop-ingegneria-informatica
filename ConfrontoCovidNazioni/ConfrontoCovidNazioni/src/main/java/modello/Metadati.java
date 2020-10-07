package modello;

public class Metadati {
	String alias;
	String sourceField;
	String type;
	
	public Metadati(String alias, String sourceField, String type) {
		super();
		this.alias = alias;
		this.sourceField = sourceField;
		this.type = type;
	}
	
	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
	}


	public String getSourceField() {
		return sourceField;
	}


	public void setSourceField(String sourceField) {
		this.sourceField = sourceField;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


}
