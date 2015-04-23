
  package gen;
  public class W_Gen20 {
  		@com.google.inject.Inject
  		public W_Gen20(W_Gen21 w_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  