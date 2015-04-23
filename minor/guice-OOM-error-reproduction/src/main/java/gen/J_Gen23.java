
  package gen;
  public class J_Gen23 {
  		@com.google.inject.Inject
  		public J_Gen23(J_Gen24 j_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  