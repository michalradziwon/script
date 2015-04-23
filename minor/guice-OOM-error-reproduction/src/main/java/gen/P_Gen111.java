
  package gen;
  public class P_Gen111 {
  		@com.google.inject.Inject
  		public P_Gen111(P_Gen112 p_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  