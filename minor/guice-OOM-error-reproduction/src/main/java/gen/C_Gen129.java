
  package gen;
  public class C_Gen129 {
  		@com.google.inject.Inject
  		public C_Gen129(C_Gen130 c_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  