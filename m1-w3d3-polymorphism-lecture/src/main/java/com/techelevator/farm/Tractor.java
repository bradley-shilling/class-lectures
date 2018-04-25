package com.techelevator.farm;

public class Tractor implements Singable {
		private String name = "Steve";
		private String sound = "vroom!";
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSound() {
			return sound;
		}
		public void setSound(String sound) {
			this.sound = sound;
		}
	
}
