
  package gen;
  public class W_Gen112 {
  		@com.google.inject.Inject
  		public W_Gen112(W_Gen113 w_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  