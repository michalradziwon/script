
  package gen;
  public class C_Gen82 {
  		@com.google.inject.Inject
  		public C_Gen82(C_Gen83 c_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  