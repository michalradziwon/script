
  package gen;
  public class W_Gen41 {
  		@com.google.inject.Inject
  		public W_Gen41(W_Gen42 w_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  