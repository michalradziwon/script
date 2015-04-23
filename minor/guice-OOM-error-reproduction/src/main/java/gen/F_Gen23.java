
  package gen;
  public class F_Gen23 {
  		@com.google.inject.Inject
  		public F_Gen23(F_Gen24 f_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  