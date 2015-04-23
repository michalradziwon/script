
  package gen;
  public class P_Gen75 {
  		@com.google.inject.Inject
  		public P_Gen75(P_Gen76 p_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  