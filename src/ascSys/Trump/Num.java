package ascSys.Trump;

public enum Num {
	A{
		@Override
		public int getScore(){
			return 11;
		}@Override
		public int getScore(boolean changeA){
			if(changeA){
				return 11;
			}
			return 1;
		}
	},N2,N3,M4,N5,N6,N7,N8,N9,N10,J{

		@Override
		public int getScore(){
			return 10;
		}
		@Override
		public int getScore(boolean changeA){
			return 10;
		}
	},Q{
		@Override
		public int getScore(){
			return 10;
		}
		@Override
		public int getScore(boolean changeA){
			return 10;
		}
	},K{
		@Override
		public int getScore(){
			return 10;
		}
		@Override
		public int getScore(boolean changeA){
			return 10;
		}
	},;

	@Deprecated
	public int getScore() {

		return this.ordinal()+1;
	}

	public int getScore(boolean changeA) {

		return this.ordinal()+1;
	}

}
