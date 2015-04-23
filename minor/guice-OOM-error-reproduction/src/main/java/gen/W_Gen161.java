
  package gen;
  public class W_Gen161 {
  		@com.google.inject.Inject
  		public W_Gen161(W_Gen162 w_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  