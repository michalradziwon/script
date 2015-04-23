
  package gen;
  public class C_Gen74 {
  		@com.google.inject.Inject
  		public C_Gen74(C_Gen75 c_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  