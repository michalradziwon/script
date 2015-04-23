
  package gen;
  public class C_Gen137 {
  		@com.google.inject.Inject
  		public C_Gen137(C_Gen138 c_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  