
  package gen;
  public class W_Gen40 {
  		@com.google.inject.Inject
  		public W_Gen40(W_Gen41 w_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  