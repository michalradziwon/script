
  package gen;
  public class H_Gen109 {
  		@com.google.inject.Inject
  		public H_Gen109(H_Gen110 h_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  