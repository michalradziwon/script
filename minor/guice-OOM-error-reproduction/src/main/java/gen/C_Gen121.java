
  package gen;
  public class C_Gen121 {
  		@com.google.inject.Inject
  		public C_Gen121(C_Gen122 c_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  