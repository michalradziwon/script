
  package gen;
  public class H_Gen46 {
  		@com.google.inject.Inject
  		public H_Gen46(H_Gen47 h_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  