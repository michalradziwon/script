
  package gen;
  public class W_Gen197 {
  		@com.google.inject.Inject
  		public W_Gen197(W_Gen198 w_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  