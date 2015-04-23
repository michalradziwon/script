
  package gen;
  public class E_Gen18 {
  		@com.google.inject.Inject
  		public E_Gen18(E_Gen19 e_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  