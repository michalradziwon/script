
  package gen;
  public class H_Gen145 {
  		@com.google.inject.Inject
  		public H_Gen145(H_Gen146 h_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  