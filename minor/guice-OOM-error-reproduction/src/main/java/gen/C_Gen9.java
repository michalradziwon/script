
  package gen;
  public class C_Gen9 {
  		@com.google.inject.Inject
  		public C_Gen9(C_Gen10 c_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  