
  package gen;
  public class C_Gen145 {
  		@com.google.inject.Inject
  		public C_Gen145(C_Gen146 c_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  