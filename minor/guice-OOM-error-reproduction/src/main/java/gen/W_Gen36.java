
  package gen;
  public class W_Gen36 {
  		@com.google.inject.Inject
  		public W_Gen36(W_Gen37 w_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  