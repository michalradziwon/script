
  package gen;
  public class P_Gen122 {
  		@com.google.inject.Inject
  		public P_Gen122(P_Gen123 p_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  