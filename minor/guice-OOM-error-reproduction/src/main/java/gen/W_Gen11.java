
  package gen;
  public class W_Gen11 {
  		@com.google.inject.Inject
  		public W_Gen11(W_Gen12 w_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  