
  package gen;
  public class C_Gen50 {
  		@com.google.inject.Inject
  		public C_Gen50(C_Gen51 c_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  