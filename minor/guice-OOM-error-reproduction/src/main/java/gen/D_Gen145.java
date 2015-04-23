
  package gen;
  public class D_Gen145 {
  		@com.google.inject.Inject
  		public D_Gen145(D_Gen146 d_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  