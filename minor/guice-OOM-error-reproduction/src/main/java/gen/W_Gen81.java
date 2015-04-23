
  package gen;
  public class W_Gen81 {
  		@com.google.inject.Inject
  		public W_Gen81(W_Gen82 w_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  