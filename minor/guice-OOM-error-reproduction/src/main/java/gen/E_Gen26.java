
  package gen;
  public class E_Gen26 {
  		@com.google.inject.Inject
  		public E_Gen26(E_Gen27 e_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  