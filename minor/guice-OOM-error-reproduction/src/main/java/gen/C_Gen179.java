
  package gen;
  public class C_Gen179 {
  		@com.google.inject.Inject
  		public C_Gen179(C_Gen180 c_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  