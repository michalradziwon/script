
  package gen;
  public class C_Gen120 {
  		@com.google.inject.Inject
  		public C_Gen120(C_Gen121 c_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  