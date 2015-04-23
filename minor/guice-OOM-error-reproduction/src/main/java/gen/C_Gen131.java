
  package gen;
  public class C_Gen131 {
  		@com.google.inject.Inject
  		public C_Gen131(C_Gen132 c_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  