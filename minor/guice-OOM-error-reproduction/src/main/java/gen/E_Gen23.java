
  package gen;
  public class E_Gen23 {
  		@com.google.inject.Inject
  		public E_Gen23(E_Gen24 e_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  