
  package gen;
  public class C_Gen65 {
  		@com.google.inject.Inject
  		public C_Gen65(C_Gen66 c_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  