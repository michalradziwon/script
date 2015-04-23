
  package gen;
  public class C_Gen112 {
  		@com.google.inject.Inject
  		public C_Gen112(C_Gen113 c_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  