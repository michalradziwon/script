
  package gen;
  public class E_Gen180 {
  		@com.google.inject.Inject
  		public E_Gen180(E_Gen181 e_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  