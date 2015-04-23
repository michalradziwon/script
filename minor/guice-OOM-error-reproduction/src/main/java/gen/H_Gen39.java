
  package gen;
  public class H_Gen39 {
  		@com.google.inject.Inject
  		public H_Gen39(H_Gen40 h_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  