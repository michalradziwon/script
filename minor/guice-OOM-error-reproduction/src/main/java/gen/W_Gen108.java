
  package gen;
  public class W_Gen108 {
  		@com.google.inject.Inject
  		public W_Gen108(W_Gen109 w_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  