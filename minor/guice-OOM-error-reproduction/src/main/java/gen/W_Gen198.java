
  package gen;
  public class W_Gen198 {
  		@com.google.inject.Inject
  		public W_Gen198(W_Gen199 w_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  