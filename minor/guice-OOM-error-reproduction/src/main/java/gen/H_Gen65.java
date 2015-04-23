
  package gen;
  public class H_Gen65 {
  		@com.google.inject.Inject
  		public H_Gen65(H_Gen66 h_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  