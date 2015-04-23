
  package gen;
  public class C_Gen90 {
  		@com.google.inject.Inject
  		public C_Gen90(C_Gen91 c_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  