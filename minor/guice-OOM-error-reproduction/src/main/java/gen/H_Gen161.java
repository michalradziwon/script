
  package gen;
  public class H_Gen161 {
  		@com.google.inject.Inject
  		public H_Gen161(H_Gen162 h_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  