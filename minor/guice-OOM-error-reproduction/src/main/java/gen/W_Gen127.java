
  package gen;
  public class W_Gen127 {
  		@com.google.inject.Inject
  		public W_Gen127(W_Gen128 w_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  