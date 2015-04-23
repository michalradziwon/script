
  package gen;
  public class H_Gen133 {
  		@com.google.inject.Inject
  		public H_Gen133(H_Gen134 h_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  