
  package gen;
  public class P_Gen112 {
  		@com.google.inject.Inject
  		public P_Gen112(P_Gen113 p_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  