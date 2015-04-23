
  package gen;
  public class C_Gen130 {
  		@com.google.inject.Inject
  		public C_Gen130(C_Gen131 c_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  