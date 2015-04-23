
  package gen;
  public class H_Gen37 {
  		@com.google.inject.Inject
  		public H_Gen37(H_Gen38 h_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  