
  package gen;
  public class C_Gen78 {
  		@com.google.inject.Inject
  		public C_Gen78(C_Gen79 c_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  