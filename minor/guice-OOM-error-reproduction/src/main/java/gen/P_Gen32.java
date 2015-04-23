
  package gen;
  public class P_Gen32 {
  		@com.google.inject.Inject
  		public P_Gen32(P_Gen33 p_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  