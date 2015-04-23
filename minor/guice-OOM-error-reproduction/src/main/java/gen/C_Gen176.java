
  package gen;
  public class C_Gen176 {
  		@com.google.inject.Inject
  		public C_Gen176(C_Gen177 c_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  