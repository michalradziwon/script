
  package gen;
  public class H_Gen119 {
  		@com.google.inject.Inject
  		public H_Gen119(H_Gen120 h_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  