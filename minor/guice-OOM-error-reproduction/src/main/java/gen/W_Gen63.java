
  package gen;
  public class W_Gen63 {
  		@com.google.inject.Inject
  		public W_Gen63(W_Gen64 w_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  