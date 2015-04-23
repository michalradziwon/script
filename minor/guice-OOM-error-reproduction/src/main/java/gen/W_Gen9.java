
  package gen;
  public class W_Gen9 {
  		@com.google.inject.Inject
  		public W_Gen9(W_Gen10 w_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  