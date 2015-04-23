
  package gen;
  public class L_Gen145 {
  		@com.google.inject.Inject
  		public L_Gen145(L_Gen146 l_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  