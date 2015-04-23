
  package gen;
  public class H_Gen142 {
  		@com.google.inject.Inject
  		public H_Gen142(H_Gen143 h_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  