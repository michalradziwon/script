
  package gen;
  public class C_Gen144 {
  		@com.google.inject.Inject
  		public C_Gen144(C_Gen145 c_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  