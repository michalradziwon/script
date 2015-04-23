
  package gen;
  public class E_Gen99 {
  		@com.google.inject.Inject
  		public E_Gen99(E_Gen100 e_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  