
  package gen;
  public class P_Gen47 {
  		@com.google.inject.Inject
  		public P_Gen47(P_Gen48 p_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  