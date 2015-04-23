
  package gen;
  public class H_Gen122 {
  		@com.google.inject.Inject
  		public H_Gen122(H_Gen123 h_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  