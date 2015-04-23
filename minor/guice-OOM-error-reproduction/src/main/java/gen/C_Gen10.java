
  package gen;
  public class C_Gen10 {
  		@com.google.inject.Inject
  		public C_Gen10(C_Gen11 c_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  