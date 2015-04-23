
  package gen;
  public class C_Gen26 {
  		@com.google.inject.Inject
  		public C_Gen26(C_Gen27 c_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  