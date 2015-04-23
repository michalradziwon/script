
  package gen;
  public class P_Gen185 {
  		@com.google.inject.Inject
  		public P_Gen185(P_Gen186 p_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  