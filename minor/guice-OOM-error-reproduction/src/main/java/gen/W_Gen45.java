
  package gen;
  public class W_Gen45 {
  		@com.google.inject.Inject
  		public W_Gen45(W_Gen46 w_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  