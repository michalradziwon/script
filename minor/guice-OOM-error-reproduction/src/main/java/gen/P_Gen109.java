
  package gen;
  public class P_Gen109 {
  		@com.google.inject.Inject
  		public P_Gen109(P_Gen110 p_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  