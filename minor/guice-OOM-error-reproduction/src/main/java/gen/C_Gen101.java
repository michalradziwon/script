
  package gen;
  public class C_Gen101 {
  		@com.google.inject.Inject
  		public C_Gen101(C_Gen102 c_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  