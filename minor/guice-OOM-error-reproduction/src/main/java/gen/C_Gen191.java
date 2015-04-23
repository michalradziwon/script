
  package gen;
  public class C_Gen191 {
  		@com.google.inject.Inject
  		public C_Gen191(C_Gen192 c_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  