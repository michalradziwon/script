
  package gen;
  public class U_Gen23 {
  		@com.google.inject.Inject
  		public U_Gen23(U_Gen24 u_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  