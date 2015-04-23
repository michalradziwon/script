
  package gen;
  public class C_Gen182 {
  		@com.google.inject.Inject
  		public C_Gen182(C_Gen183 c_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  