
  package gen;
  public class H_Gen83 {
  		@com.google.inject.Inject
  		public H_Gen83(H_Gen84 h_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  