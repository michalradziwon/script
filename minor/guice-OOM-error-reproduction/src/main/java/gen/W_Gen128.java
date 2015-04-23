
  package gen;
  public class W_Gen128 {
  		@com.google.inject.Inject
  		public W_Gen128(W_Gen129 w_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  