
  package gen;
  public class C_Gen104 {
  		@com.google.inject.Inject
  		public C_Gen104(C_Gen105 c_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  