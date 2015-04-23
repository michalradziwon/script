
  package gen;
  public class C_Gen57 {
  		@com.google.inject.Inject
  		public C_Gen57(C_Gen58 c_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  