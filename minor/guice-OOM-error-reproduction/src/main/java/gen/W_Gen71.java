
  package gen;
  public class W_Gen71 {
  		@com.google.inject.Inject
  		public W_Gen71(W_Gen72 w_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  