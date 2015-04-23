
  package gen;
  public class C_Gen128 {
  		@com.google.inject.Inject
  		public C_Gen128(C_Gen129 c_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  