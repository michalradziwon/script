
  package gen;
  public class P_Gen176 {
  		@com.google.inject.Inject
  		public P_Gen176(P_Gen177 p_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  