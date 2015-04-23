
  package gen;
  public class P_Gen65 {
  		@com.google.inject.Inject
  		public P_Gen65(P_Gen66 p_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  