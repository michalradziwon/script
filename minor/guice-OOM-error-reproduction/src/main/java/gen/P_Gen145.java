
  package gen;
  public class P_Gen145 {
  		@com.google.inject.Inject
  		public P_Gen145(P_Gen146 p_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  