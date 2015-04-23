
  package gen;
  public class C_Gen105 {
  		@com.google.inject.Inject
  		public C_Gen105(C_Gen106 c_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  