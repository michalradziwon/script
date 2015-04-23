
  package gen;
  public class C_Gen16 {
  		@com.google.inject.Inject
  		public C_Gen16(C_Gen17 c_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  