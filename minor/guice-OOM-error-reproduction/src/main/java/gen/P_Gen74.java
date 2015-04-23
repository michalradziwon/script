
  package gen;
  public class P_Gen74 {
  		@com.google.inject.Inject
  		public P_Gen74(P_Gen75 p_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  