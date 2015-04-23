
  package gen;
  public class H_Gen187 {
  		@com.google.inject.Inject
  		public H_Gen187(H_Gen188 h_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  