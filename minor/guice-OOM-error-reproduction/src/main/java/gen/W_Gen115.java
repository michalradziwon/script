
  package gen;
  public class W_Gen115 {
  		@com.google.inject.Inject
  		public W_Gen115(W_Gen116 w_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  