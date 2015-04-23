
  package gen;
  public class W_Gen8 {
  		@com.google.inject.Inject
  		public W_Gen8(W_Gen9 w_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  