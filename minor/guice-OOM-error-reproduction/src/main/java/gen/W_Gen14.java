
  package gen;
  public class W_Gen14 {
  		@com.google.inject.Inject
  		public W_Gen14(W_Gen15 w_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  