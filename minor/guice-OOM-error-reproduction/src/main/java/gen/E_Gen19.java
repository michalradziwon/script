
  package gen;
  public class E_Gen19 {
  		@com.google.inject.Inject
  		public E_Gen19(E_Gen20 e_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  