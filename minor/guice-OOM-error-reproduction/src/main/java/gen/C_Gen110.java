
  package gen;
  public class C_Gen110 {
  		@com.google.inject.Inject
  		public C_Gen110(C_Gen111 c_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  