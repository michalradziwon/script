
  package gen;
  public class C_Gen76 {
  		@com.google.inject.Inject
  		public C_Gen76(C_Gen77 c_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  