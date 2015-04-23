
  package gen;
  public class C_Gen125 {
  		@com.google.inject.Inject
  		public C_Gen125(C_Gen126 c_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  