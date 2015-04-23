
  package gen;
  public class W_Gen104 {
  		@com.google.inject.Inject
  		public W_Gen104(W_Gen105 w_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  