
  package gen;
  public class C_Gen55 {
  		@com.google.inject.Inject
  		public C_Gen55(C_Gen56 c_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  