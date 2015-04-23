
  package gen;
  public class H_Gen140 {
  		@com.google.inject.Inject
  		public H_Gen140(H_Gen141 h_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  