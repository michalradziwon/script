
  package gen;
  public class P_Gen187 {
  		@com.google.inject.Inject
  		public P_Gen187(P_Gen188 p_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  