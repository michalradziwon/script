
  package gen;
  public class C_Gen68 {
  		@com.google.inject.Inject
  		public C_Gen68(C_Gen69 c_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  