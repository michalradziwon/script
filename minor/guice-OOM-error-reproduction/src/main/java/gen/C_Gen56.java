
  package gen;
  public class C_Gen56 {
  		@com.google.inject.Inject
  		public C_Gen56(C_Gen57 c_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  