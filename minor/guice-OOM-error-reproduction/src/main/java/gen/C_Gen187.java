
  package gen;
  public class C_Gen187 {
  		@com.google.inject.Inject
  		public C_Gen187(C_Gen188 c_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  