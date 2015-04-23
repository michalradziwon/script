
  package gen;
  public class W_Gen66 {
  		@com.google.inject.Inject
  		public W_Gen66(W_Gen67 w_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  