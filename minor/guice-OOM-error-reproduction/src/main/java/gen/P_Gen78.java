
  package gen;
  public class P_Gen78 {
  		@com.google.inject.Inject
  		public P_Gen78(P_Gen79 p_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  