
  package gen;
  public class P_Gen23 {
  		@com.google.inject.Inject
  		public P_Gen23(P_Gen24 p_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  