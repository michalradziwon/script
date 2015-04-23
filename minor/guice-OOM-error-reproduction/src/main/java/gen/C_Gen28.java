
  package gen;
  public class C_Gen28 {
  		@com.google.inject.Inject
  		public C_Gen28(C_Gen29 c_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  