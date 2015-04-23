
  package gen;
  public class P_Gen182 {
  		@com.google.inject.Inject
  		public P_Gen182(P_Gen183 p_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  