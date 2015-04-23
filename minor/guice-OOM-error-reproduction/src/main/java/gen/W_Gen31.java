
  package gen;
  public class W_Gen31 {
  		@com.google.inject.Inject
  		public W_Gen31(W_Gen32 w_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  