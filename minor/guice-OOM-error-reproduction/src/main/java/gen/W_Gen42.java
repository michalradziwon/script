
  package gen;
  public class W_Gen42 {
  		@com.google.inject.Inject
  		public W_Gen42(W_Gen43 w_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  