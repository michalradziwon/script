
  package gen;
  public class P_Gen138 {
  		@com.google.inject.Inject
  		public P_Gen138(P_Gen139 p_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  