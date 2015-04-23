
  package gen;
  public class P_Gen108 {
  		@com.google.inject.Inject
  		public P_Gen108(P_Gen109 p_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  