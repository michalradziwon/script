
  package gen;
  public class W_Gen10 {
  		@com.google.inject.Inject
  		public W_Gen10(W_Gen11 w_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  