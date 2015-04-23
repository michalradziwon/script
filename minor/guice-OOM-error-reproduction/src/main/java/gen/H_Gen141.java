
  package gen;
  public class H_Gen141 {
  		@com.google.inject.Inject
  		public H_Gen141(H_Gen142 h_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  