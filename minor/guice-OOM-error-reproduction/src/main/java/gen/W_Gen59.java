
  package gen;
  public class W_Gen59 {
  		@com.google.inject.Inject
  		public W_Gen59(W_Gen60 w_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  