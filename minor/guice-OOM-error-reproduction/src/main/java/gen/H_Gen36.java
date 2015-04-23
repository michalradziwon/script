
  package gen;
  public class H_Gen36 {
  		@com.google.inject.Inject
  		public H_Gen36(H_Gen37 h_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  