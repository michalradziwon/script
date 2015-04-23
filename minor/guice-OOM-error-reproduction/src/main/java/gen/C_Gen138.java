
  package gen;
  public class C_Gen138 {
  		@com.google.inject.Inject
  		public C_Gen138(C_Gen139 c_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  