
  package gen;
  public class H_Gen198 {
  		@com.google.inject.Inject
  		public H_Gen198(H_Gen199 h_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  