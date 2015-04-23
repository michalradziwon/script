
  package gen;
  public class J_Gen145 {
  		@com.google.inject.Inject
  		public J_Gen145(J_Gen146 j_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  