
  package gen;
  public class W_Gen177 {
  		@com.google.inject.Inject
  		public W_Gen177(W_Gen178 w_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  