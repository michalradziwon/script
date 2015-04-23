
  package gen;
  public class C_Gen23 {
  		@com.google.inject.Inject
  		public C_Gen23(C_Gen24 c_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  