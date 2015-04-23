
  package gen;
  public class C_Gen96 {
  		@com.google.inject.Inject
  		public C_Gen96(C_Gen97 c_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  