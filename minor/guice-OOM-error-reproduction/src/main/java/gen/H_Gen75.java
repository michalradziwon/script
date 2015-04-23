
  package gen;
  public class H_Gen75 {
  		@com.google.inject.Inject
  		public H_Gen75(H_Gen76 h_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  