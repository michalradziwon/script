
  package gen;
  public class P_Gen120 {
  		@com.google.inject.Inject
  		public P_Gen120(P_Gen121 p_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  