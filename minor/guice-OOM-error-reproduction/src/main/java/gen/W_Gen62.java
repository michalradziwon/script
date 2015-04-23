
  package gen;
  public class W_Gen62 {
  		@com.google.inject.Inject
  		public W_Gen62(W_Gen63 w_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  