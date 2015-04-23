
  package gen;
  public class W_Gen60 {
  		@com.google.inject.Inject
  		public W_Gen60(W_Gen61 w_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  