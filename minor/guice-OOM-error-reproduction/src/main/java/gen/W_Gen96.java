
  package gen;
  public class W_Gen96 {
  		@com.google.inject.Inject
  		public W_Gen96(W_Gen97 w_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  