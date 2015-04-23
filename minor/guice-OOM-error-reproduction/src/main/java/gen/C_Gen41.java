
  package gen;
  public class C_Gen41 {
  		@com.google.inject.Inject
  		public C_Gen41(C_Gen42 c_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  