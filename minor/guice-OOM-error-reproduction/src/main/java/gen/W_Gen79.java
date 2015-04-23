
  package gen;
  public class W_Gen79 {
  		@com.google.inject.Inject
  		public W_Gen79(W_Gen80 w_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  