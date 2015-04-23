
  package gen;
  public class C_Gen8 {
  		@com.google.inject.Inject
  		public C_Gen8(C_Gen9 c_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  