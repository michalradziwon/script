
  package gen;
  public class W_Gen199 {
  		@com.google.inject.Inject
  		public W_Gen199(W_Gen200 w_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  