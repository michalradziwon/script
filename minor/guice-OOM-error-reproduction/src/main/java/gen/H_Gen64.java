
  package gen;
  public class H_Gen64 {
  		@com.google.inject.Inject
  		public H_Gen64(H_Gen65 h_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  