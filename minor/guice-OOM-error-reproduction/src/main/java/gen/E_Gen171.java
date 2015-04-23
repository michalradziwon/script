
  package gen;
  public class E_Gen171 {
  		@com.google.inject.Inject
  		public E_Gen171(E_Gen172 e_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  