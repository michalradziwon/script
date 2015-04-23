
  package gen;
  public class C_Gen6 {
  		@com.google.inject.Inject
  		public C_Gen6(C_Gen7 c_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  