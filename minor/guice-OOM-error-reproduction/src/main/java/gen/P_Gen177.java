
  package gen;
  public class P_Gen177 {
  		@com.google.inject.Inject
  		public P_Gen177(P_Gen178 p_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  