
  package gen;
  public class C_Gen111 {
  		@com.google.inject.Inject
  		public C_Gen111(C_Gen112 c_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  