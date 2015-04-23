
  package gen;
  public class C_Gen62 {
  		@com.google.inject.Inject
  		public C_Gen62(C_Gen63 c_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  