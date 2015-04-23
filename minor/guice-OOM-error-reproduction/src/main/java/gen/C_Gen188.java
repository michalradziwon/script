
  package gen;
  public class C_Gen188 {
  		@com.google.inject.Inject
  		public C_Gen188(C_Gen189 c_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  