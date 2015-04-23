
  package gen;
  public class H_Gen131 {
  		@com.google.inject.Inject
  		public H_Gen131(H_Gen132 h_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  