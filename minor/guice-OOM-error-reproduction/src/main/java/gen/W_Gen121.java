
  package gen;
  public class W_Gen121 {
  		@com.google.inject.Inject
  		public W_Gen121(W_Gen122 w_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  