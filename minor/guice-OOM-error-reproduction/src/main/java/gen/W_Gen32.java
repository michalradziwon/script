
  package gen;
  public class W_Gen32 {
  		@com.google.inject.Inject
  		public W_Gen32(W_Gen33 w_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  