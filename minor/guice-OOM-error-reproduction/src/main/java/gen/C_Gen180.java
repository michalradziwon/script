
  package gen;
  public class C_Gen180 {
  		@com.google.inject.Inject
  		public C_Gen180(C_Gen181 c_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  