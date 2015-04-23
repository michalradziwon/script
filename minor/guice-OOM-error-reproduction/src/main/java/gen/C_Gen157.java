
  package gen;
  public class C_Gen157 {
  		@com.google.inject.Inject
  		public C_Gen157(C_Gen158 c_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  