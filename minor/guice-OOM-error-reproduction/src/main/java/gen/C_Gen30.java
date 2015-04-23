
  package gen;
  public class C_Gen30 {
  		@com.google.inject.Inject
  		public C_Gen30(C_Gen31 c_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  