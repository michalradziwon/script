
  package gen;
  public class W_Gen35 {
  		@com.google.inject.Inject
  		public W_Gen35(W_Gen36 w_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  