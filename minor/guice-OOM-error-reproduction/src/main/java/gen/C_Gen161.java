
  package gen;
  public class C_Gen161 {
  		@com.google.inject.Inject
  		public C_Gen161(C_Gen162 c_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  