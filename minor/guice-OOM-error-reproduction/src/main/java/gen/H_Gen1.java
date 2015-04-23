
  package gen;
  public class H_Gen1 {
  		@com.google.inject.Inject
  		public H_Gen1(H_Gen2 h_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  