
  package gen;
  public class C_Gen197 {
  		@com.google.inject.Inject
  		public C_Gen197(C_Gen198 c_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  