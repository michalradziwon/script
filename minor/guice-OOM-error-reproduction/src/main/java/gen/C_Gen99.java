
  package gen;
  public class C_Gen99 {
  		@com.google.inject.Inject
  		public C_Gen99(C_Gen100 c_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  