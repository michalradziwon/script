
  package gen;
  public class W_Gen28 {
  		@com.google.inject.Inject
  		public W_Gen28(W_Gen29 w_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  