
  package gen;
  public class P_Gen76 {
  		@com.google.inject.Inject
  		public P_Gen76(P_Gen77 p_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  