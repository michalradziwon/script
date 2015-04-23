
  package gen;
  public class C_Gen108 {
  		@com.google.inject.Inject
  		public C_Gen108(C_Gen109 c_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  