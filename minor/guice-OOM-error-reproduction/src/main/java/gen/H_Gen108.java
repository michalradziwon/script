
  package gen;
  public class H_Gen108 {
  		@com.google.inject.Inject
  		public H_Gen108(H_Gen109 h_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  