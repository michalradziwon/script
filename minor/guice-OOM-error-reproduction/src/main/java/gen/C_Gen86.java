
  package gen;
  public class C_Gen86 {
  		@com.google.inject.Inject
  		public C_Gen86(C_Gen87 c_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  