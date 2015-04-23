
  package gen;
  public class P_Gen77 {
  		@com.google.inject.Inject
  		public P_Gen77(P_Gen78 p_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  