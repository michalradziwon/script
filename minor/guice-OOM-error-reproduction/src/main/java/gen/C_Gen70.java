
  package gen;
  public class C_Gen70 {
  		@com.google.inject.Inject
  		public C_Gen70(C_Gen71 c_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  