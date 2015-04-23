
  package gen;
  public class H_Gen130 {
  		@com.google.inject.Inject
  		public H_Gen130(H_Gen131 h_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  