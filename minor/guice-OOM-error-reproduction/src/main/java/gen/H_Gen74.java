
  package gen;
  public class H_Gen74 {
  		@com.google.inject.Inject
  		public H_Gen74(H_Gen75 h_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  