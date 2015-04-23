
  package gen;
  public class C_Gen27 {
  		@com.google.inject.Inject
  		public C_Gen27(C_Gen28 c_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  