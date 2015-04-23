
  package gen;
  public class H_Gen139 {
  		@com.google.inject.Inject
  		public H_Gen139(H_Gen140 h_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  