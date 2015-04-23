
  package gen;
  public class C_Gen66 {
  		@com.google.inject.Inject
  		public C_Gen66(C_Gen67 c_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  