
  package gen;
  public class C_Gen42 {
  		@com.google.inject.Inject
  		public C_Gen42(C_Gen43 c_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  