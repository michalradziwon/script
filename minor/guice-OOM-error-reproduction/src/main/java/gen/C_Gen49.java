
  package gen;
  public class C_Gen49 {
  		@com.google.inject.Inject
  		public C_Gen49(C_Gen50 c_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  