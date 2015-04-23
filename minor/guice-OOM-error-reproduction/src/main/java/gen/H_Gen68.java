
  package gen;
  public class H_Gen68 {
  		@com.google.inject.Inject
  		public H_Gen68(H_Gen69 h_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  