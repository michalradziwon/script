
  package gen;
  public class C_Gen92 {
  		@com.google.inject.Inject
  		public C_Gen92(C_Gen93 c_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  