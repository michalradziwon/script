
  package gen;
  public class C_Gen25 {
  		@com.google.inject.Inject
  		public C_Gen25(C_Gen26 c_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  