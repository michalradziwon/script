
  package gen;
  public class W_Gen172 {
  		@com.google.inject.Inject
  		public W_Gen172(W_Gen173 w_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  