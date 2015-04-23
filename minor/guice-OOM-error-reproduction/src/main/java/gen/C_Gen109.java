
  package gen;
  public class C_Gen109 {
  		@com.google.inject.Inject
  		public C_Gen109(C_Gen110 c_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  