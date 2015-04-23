
  package gen;
  public class P_Gen83 {
  		@com.google.inject.Inject
  		public P_Gen83(P_Gen84 p_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  