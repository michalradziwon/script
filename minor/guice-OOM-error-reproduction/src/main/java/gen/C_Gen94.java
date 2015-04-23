
  package gen;
  public class C_Gen94 {
  		@com.google.inject.Inject
  		public C_Gen94(C_Gen95 c_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  