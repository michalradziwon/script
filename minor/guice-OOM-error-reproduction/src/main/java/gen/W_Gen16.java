
  package gen;
  public class W_Gen16 {
  		@com.google.inject.Inject
  		public W_Gen16(W_Gen17 w_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  