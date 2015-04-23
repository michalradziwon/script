
  package gen;
  public class H_Gen2 {
  		@com.google.inject.Inject
  		public H_Gen2(H_Gen3 h_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  