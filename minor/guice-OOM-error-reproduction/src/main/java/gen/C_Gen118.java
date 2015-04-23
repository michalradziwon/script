
  package gen;
  public class C_Gen118 {
  		@com.google.inject.Inject
  		public C_Gen118(C_Gen119 c_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  