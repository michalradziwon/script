
  package gen;
  public class P_Gen132 {
  		@com.google.inject.Inject
  		public P_Gen132(P_Gen133 p_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  