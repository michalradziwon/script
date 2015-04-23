
  package gen;
  public class E_Gen24 {
  		@com.google.inject.Inject
  		public E_Gen24(E_Gen25 e_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  