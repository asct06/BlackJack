package ascSys.Trump;

public enum Num {
	A,N2,N3,M4,N5,N6,N7,N8,N9,N10,J{

		@Override
		public int getScore(){
			return 10;
		}
	},Q{

		@Override
		public int getScore(){
			return 10;
		}
	},K{

		@Override
		public int getScore(){
			return 10;
		}
	},;

	public int getScore() {

		return this.ordinal()+1;
	}

}
