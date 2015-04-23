
  package gen;
  public class C_Gen87 {
  		@com.google.inject.Inject
  		public C_Gen87(C_Gen88 c_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  