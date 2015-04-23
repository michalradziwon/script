
  package gen;
  public class W_Gen52 {
  		@com.google.inject.Inject
  		public W_Gen52(W_Gen53 w_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  