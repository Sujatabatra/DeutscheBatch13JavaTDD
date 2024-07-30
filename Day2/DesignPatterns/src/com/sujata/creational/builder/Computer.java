package com.sujata.creational.builder;

public class Computer {

	private String HDD;
	private String RAM;

	private boolean graphicCardEnabled;
	private boolean blueToothEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicCardEnabled() {
		return graphicCardEnabled;
	}

	public boolean isBlueToothEnabled() {
		return blueToothEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.RAM=builder.RAM;
		this.HDD=builder.HDD;
		this.blueToothEnabled=builder.blueToothEnabled;
		this.graphicCardEnabled=builder.graphicCardEnabled;
	}
	
	// BuilderClass
	public static class ComputerBuilder {
		//required parameters
		private String HDD;
		private String RAM;
		
		//optional parameters
		private boolean graphicCardEnabled;
		private boolean blueToothEnabled;
		
		public ComputerBuilder(String hDD, String rAM) {
			super();
			HDD = hDD;
			RAM = rAM;
		}

		public ComputerBuilder setGraphicCardEnabled(boolean graphicCardEnabled) {
			this.graphicCardEnabled = graphicCardEnabled;
			return this;
		}

		public ComputerBuilder setBlueToothEnabled(boolean blueToothEnabled) {
			this.blueToothEnabled = blueToothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", graphicCardEnabled=" + graphicCardEnabled
				+ ", blueToothEnabled=" + blueToothEnabled + "]";
	}
	
	
}
