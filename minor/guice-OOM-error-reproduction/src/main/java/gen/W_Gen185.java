
  package gen;
  public class W_Gen185 {
  		@com.google.inject.Inject
  		public W_Gen185(W_Gen186 w_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  