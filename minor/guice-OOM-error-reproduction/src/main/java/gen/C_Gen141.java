
  package gen;
  public class C_Gen141 {
  		@com.google.inject.Inject
  		public C_Gen141(C_Gen142 c_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  