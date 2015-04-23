
  package gen;
  public class W_Gen125 {
  		@com.google.inject.Inject
  		public W_Gen125(W_Gen126 w_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  