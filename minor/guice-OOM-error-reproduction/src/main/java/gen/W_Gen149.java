
  package gen;
  public class W_Gen149 {
  		@com.google.inject.Inject
  		public W_Gen149(W_Gen150 w_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  