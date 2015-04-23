
  package gen;
  public class Z_Gen145 {
  		@com.google.inject.Inject
  		public Z_Gen145(Z_Gen146 z_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  