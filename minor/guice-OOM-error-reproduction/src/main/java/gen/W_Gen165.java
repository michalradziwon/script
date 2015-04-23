
  package gen;
  public class W_Gen165 {
  		@com.google.inject.Inject
  		public W_Gen165(W_Gen166 w_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  