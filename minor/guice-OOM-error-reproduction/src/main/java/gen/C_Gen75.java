
  package gen;
  public class C_Gen75 {
  		@com.google.inject.Inject
  		public C_Gen75(C_Gen76 c_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  