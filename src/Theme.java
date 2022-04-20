import java.awt.Color;

public class Theme {

	private Color primaryColor;
	private Color secondaryColor;
	private Color backgroundColor;
	

	Theme(boolean isDark){
		
		if(isDark != true) {
//			Light theme:
			primaryColor = Color.RED;
			secondaryColor = Color.BLUE;
			backgroundColor = Color.LIGHT_GRAY;
			
		} else {
//			Dark theme:
			primaryColor = Color.BLUE;
			secondaryColor = Color.RED;
			backgroundColor = Color.DARK_GRAY;
		}
	}

	public Color getPrimaryColor() {
		return primaryColor;
	}


	public void setPrimaryColor(Color primaryColor) {
		this.primaryColor = primaryColor;
	}


	public Color getSecondaryColor() {
		return secondaryColor;
	}


	public void setSecondaryColor(Color secondaryColor) {
		this.secondaryColor = secondaryColor;
	}


	public Color getBackgroundColor() {
		return backgroundColor;
	}


	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}


}
