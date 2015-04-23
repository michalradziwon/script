
  package gen;
  public class E_Gen155 {
  		@com.google.inject.Inject
  		public E_Gen155(E_Gen156 e_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  