
  package gen;
  public class W_Gen19 {
  		@com.google.inject.Inject
  		public W_Gen19(W_Gen20 w_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  