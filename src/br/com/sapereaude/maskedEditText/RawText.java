package br.com.sapereaude.maskedEditText;


public class RawText {
	private String text;
	
	public RawText() {
		text = "";
	}
	
	public void subtractFromString(Range range) {
		String firstPart = "";
		String lastPart = "";
		
		if(range.getStart() > 0 && range.getStart() <= text.length()) {
			firstPart = text.substring(0, range.getStart());
		}
		if(range.getEnd() >= 0 && range.getEnd() < text.length()) {
			lastPart = text.substring(range.getEnd(), text.length());
		}
		text = firstPart.concat(lastPart);
	}

	public int addToString(String string, int start, int maxLength) {
		String firstPart = "";
		String lastPart = "";
		int count = string.length();
		
		if(start > 0) {
			firstPart = text.substring(0, start);
		}
		if(start >= 0 && start < text.length()) {
			lastPart = text.substring(start, text.length());
		}
		if(text.length() + string.length() > maxLength) {
			count = maxLength - text.length();
			string = string.substring(0, count);
		}
		text = firstPart.concat(string).concat(lastPart);		
		return count;
	}

	public String getText() {
		return text;
	}

	public int length() {
		return text.length();
	}

	public char charAt(int position) {
		return text.charAt(position);
	}
}
