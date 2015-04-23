
  package gen;
  public class H_Gen106 {
  		@com.google.inject.Inject
  		public H_Gen106(H_Gen107 h_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  