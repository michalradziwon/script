
  package gen;
  public class H_Gen199 {
  		@com.google.inject.Inject
  		public H_Gen199(H_Gen200 h_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  