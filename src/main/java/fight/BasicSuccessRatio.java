package fight;

public enum BasicSuccessRatio {
	
	PHYSICAL(7),
	MAGICAL(9);
	
	private int basicSuccessRatio; 
	
	BasicSuccessRatio(int basicSuccessRatio) {
		this.basicSuccessRatio = basicSuccessRatio;
	}

	public String toString() {
		return basicSuccessRatio+"";
	}
	
	public int getBasicLuck() {
		return basicSuccessRatio;
	}
}
